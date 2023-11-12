DROP DATABASE IF EXISTS tiktok;
CREATE DATABASE IF NOT EXISTS tiktok;
use tiktok;
CREATE TABLE IF NOT EXISTS users (
  id INT PRIMARY KEY AUTO_INCREMENT,
  username VARCHAR(30)
);
CREATE TABLE IF NOT EXISTS videos (
  id INT PRIMARY KEY AUTO_INCREMENT,
  upload_date DATETIME,
  duration INT,
  owner_id INT,
  FOREIGN KEY (owner_id) REFERENCES users(id)
);
CREATE TABLE IF NOT EXISTS comments (
  id INT PRIMARY KEY AUTO_INCREMENT,
  text VARCHAR(250),
  video_id INT,
  author_id INT,
  creation_date DATETIME,
  FOREIGN KEY (video_id) REFERENCES videos(id),
  FOREIGN KEY (author_id) REFERENCES users(id)
);
CREATE TABLE IF NOT EXISTS likes (
  user_id INT,
  video_id INT,
  PRIMARY KEY (user_id, video_id),
  FOREIGN KEY (user_id) REFERENCES users(id),
  FOREIGN KEY (video_id) REFERENCES videos(id)
);
INSERT INTO users(username) VALUES
('user1'),
('user2'),
('user3'),
('user4'),
('user5');
INSERT INTO videos(upload_date,duration,owner_id) VALUES
('2022-01-01 00:01:13', 72, 1),
('2022-01-02 12:08:47', 72, 1),
('2022-01-05 16:45:08', 46, 2),
('2022-01-06 20:02:23', 83, 2),
('2022-01-02 06:49:47', 15, 3),
('2022-01-02 13:13:58', 23, 3),
('2022-01-07 17:54:13', 57, 4),
('2022-01-10 03:05:17', 48, 4),
('2022-01-03 15:46:09', 94, 5),
('2022-01-13 15:17:33', 115, 5);
INSERT INTO comments(text,video_id,author_id,creation_date) VALUES
('Nice video!', 1, 2, '2022-01-01 00:10:00'),
('Good job, man, I love your videos', 1, 3, '2022-01-01 02:00:00'),
('Wow!!! So crazy, dude', 2, 4, '2022-01-02 13:00:00'),
('Braaa', 2, 5, '2022-01-02 14:00:00'),
('Oh, damn, so close to that', 3, 1, '2022-01-10 09:00:00'),
('I would make it better', 3, 2, '2022-01-08 07:00:00'),
('I want to mary you', 4, 2, '2022-01-15 00:00:00'),
('My bro', 4, 5, '2022-01-16 00:00:00'),
('Nice job', 5, 1, '2022-01-17 00:00:00');
INSERT INTO likes(user_id, video_id) VALUES
(1, 3),
(1, 7),
(1, 5),
(2, 1),
(2, 2),
(2, 5),
(3, 1),
(3, 2),
(4, 1),
(4, 3),
(4, 5),
(4, 9);

SELECT * FROM users AS u
JOIN likes AS l ON u.id = l.user_id
ORDER BY l.video_id
LIMIT 5;

SELECT l.video_id, u.username FROM users AS u
JOIN likes AS l ON u.id = l.user_id
ORDER BY l.video_id
LIMIT 5;

SELECT duration FROM users AS u
JOIN likes AS l ON
	l.user_id = u.id AND u.username = 'user1' 
JOIN videos AS v ON v.id = l.video_id;

SELECT * FROM comments AS c
JOIN users AS u ON
	u.id > 2 AND u.id = c.author_id;
    
SELECT
	u.username,
    c.text,
    v.duration AS 'video duration',
    v.upload_date AS 'video upload date'
FROM comments AS c
JOIN users AS u ON
	u.id = c.author_id AND u.id > 2
RIGHT JOIN videos AS v ON
	v.id = c.video_id 
-- сортировка
-- ASC - по возрастанию (по умолчанию)
-- ASCending 
-- DESC - по убыванию
-- DESCending 
ORDER BY username, text DESC;

SELECT upload_date,	duration FROM videos AS v 
JOIN users AS u ON u.id = v.owner_id
WHERE u.id = 5;