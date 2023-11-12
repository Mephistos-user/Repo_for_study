DROP DATABASE IF EXISTS vk;
CREATE DATABASE IF NOT EXISTS vk;
use vk;
CREATE TABLE IF NOT EXISTS users (
  id INT PRIMARY KEY AUTO_INCREMENT,
  username VARCHAR(30),
  password_hash VARCHAR(300),
  last_seen DATETIME
);
CREATE TABLE IF NOT EXISTS chats (
  id INT PRIMARY KEY AUTO_INCREMENT,
  title VARCHAR(50),
  description VARCHAR(200),
  owner_id INT,
  FOREIGN KEY (owner_id) REFERENCES users(id)
);
CREATE TABLE IF NOT EXISTS users_to_chats (
  user_id INT,
  chat_id INT,
  PRIMARY KEY (user_id, chat_id),
  enter_datetime DATETIME,
  FOREIGN KEY (user_id) REFERENCES users(id),
  FOREIGN KEY (chat_id) REFERENCES chats(id)
);
INSERT INTO users(username) VALUES
('user 1'),
('user 2'),
('user 3'),
('user 4'),
('user 5'),
('user 6'),
('user 7'),
('user 8');
INSERT INTO chats(title,description,owner_id) VALUES
('chat 1', 'for car lovers', 1),
('chat 2', 'anime is the best kino', 2),
('chat 3', '', 4);
INSERT INTO users_to_chats(user_id,chat_id,enter_datetime) VALUES
(1, 1, '2022-01-15 14:56:07'),
(2, 1, '2022-01-15 14:56:07'),
(3, 1, '2022-01-15 14:56:07'),
(4, 1, '2022-01-17 09:34:27'),
(1, 2, '2022-01-16 14:56:07'),
(2, 2, '2022-01-16 14:56:07'),
(4, 2, '2022-01-17 14:56:07'),
(5, 2, '2022-01-18 14:56:07'),
(7, 2, '2022-01-23 13:00:04'),
(8, 2, '2022-01-30 13:09:13'),
(3, 3, '2022-01-25 00:06:54'),
(4, 3, '2022-01-25 00:06:54');
-- выборка с JOIN ON:
SELECT * FROM users AS u
JOIN users_to_chats AS utc ON u.id = utc.user_id;
-- та же выборка, но с WHERE:
SELECT * FROM users AS u, users_to_chats AS utc
WHERE u.id = utc.user_id;

SELECT u.username, utc.chat_id AS chat FROM users AS u
JOIN users_to_chats AS utc ON u.id = utc.user_id;
-- JOIN with WHERE:
SELECT u.username, utc.chat_id AS chat FROM users AS u
JOIN users_to_chats AS utc ON u.id = utc.user_id
WHERE u.id > 5;

SELECT u.username,
utc.chat_id AS 'chat-id',
c.title AS chat
FROM users AS u
JOIN users_to_chats AS utc ON u.id = utc.user_id
JOIN chats AS c ON c.id = utc.chat_id
-- ORDER BY u.username; -- сортировка по username
--    ORDER BY c.title; -- сортировка по title
ORDER BY c.description; -- сортировка по description

-- внешний JOIN - LEFT JOIN, RIGHT JOIN
SELECT u.username,
c.title AS chat
FROM users AS u
LEFT JOIN chats AS c ON u.id = c.owner_id
WHERE u.id < 5;

SELECT u.username,
c.title AS chat
FROM users AS u
RIGHT JOIN chats AS c ON u.id = c.owner_id
WHERE u.id < 5;