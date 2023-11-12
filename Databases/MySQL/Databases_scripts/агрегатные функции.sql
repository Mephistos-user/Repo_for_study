-- AVG: вычисляет среднее значение
-- SUM: вычисляет сумму значений
-- MIN: вычисляет наименьшее значение
-- MAX: вычисляет наибольшее значение
-- COUNT: вычислисляет количество строк в запросе
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

SELECT COUNT(*) FROM users;
SELECT COUNT(*) FROM chats;
SELECT COUNT(*) FROM users_to_chats;

SELECT COUNT(*) FROM users AS u
JOIN users_to_chats AS utc ON u.id = 1 AND utc.user_id = u.id;

DROP DATABASE IF EXISTS finances;
CREATE DATABASE IF NOT EXISTS finances;
use finances;
CREATE TABLE IF NOT EXISTS phones (
  id INT PRIMARY KEY AUTO_INCREMENT,
  factory VARCHAR(30),
  title VARCHAR(30),
  price INT  
);
INSERT INTO phones(factory,title,price) VALUES
('Apple', 'iPhone 10', 49999),
('Apple', 'iPhone 10 Pro', 59500),
('Apple', 'iPhone 10 Pro Max', 78999),
('Apple', 'iPhone 11', 62300),
('Apple', 'iPhone 11 Pro', 73499),
('Apple', 'iPhone 11 Pro Max', 88950),
('Samsung', 'Galaxy Note 8', 67320),
('Samsung', 'Galaxy Note 8 Pro', 75800),
('Samsung', 'Galaxy Note 9', 71460),
('Samsung', 'Galaxy Note 9 Pro', 79820),
('OnePlus', '7', 45670),
('OnePlus', '7T', 49000),
('OnePlus', '8', 55550),
('OnePlus', '9T', 66250),
('Huawei', 'P Smart 2019', 17890),
('Honor', '20S', 21450),
('Razor', 'Phone', 68900);

SELECT COUNT(*) FROM phones;

SELECT AVG(price) AS 'middle price' FROM phones;
SELECT FLOOR(AVG(price)) AS 'middle price' FROM phones;

SELECT MAX(price), MIN(price), SUM(price) FROM phones;

SELECT AVG(price),  SUM(price) / COUNT(price) FROM phones;

SELECT COUNT(*) FROM phones
GROUP BY factory;

SELECT COUNT(*), factory FROM phones
GROUP BY factory;

SELECT COUNT(*), title FROM phones
GROUP BY factory;

SELECT COUNT(*), ROUND(AVG(price), 2) FROM phones
GROUP BY factory
ORDER BY factory;

SELECT factory, COUNT(*) AS 'count', ROUND(AVG(price), 2) AS 'AVG price' FROM phones
WHERE price > 65000 -- условие перед группировкой
GROUP BY factory;

SELECT factory, COUNT(*) AS 'count', ROUND(AVG(price), 2) AS 'AVG price' FROM phones
GROUP BY factory
-- условие после группировки
HAVING ROUND(AVG(price), 2) > 65000;