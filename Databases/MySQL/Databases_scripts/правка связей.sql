DROP DATABASE IF EXISTS my_service;
CREATE DATABASE IF NOT EXISTS my_service;
USE my_service;
CREATE TABLE IF NOT EXISTS users
(
id INT PRIMARY KEY AUTO_INCREMENT,
email VARCHAR(50) NOT NULL,
phone VARCHAR(15) NOT NULL,
password_hash VARCHAR(50) NOT NULL,
registration_date DATETIME NOT NULL DEFAULT NOW(),
);

CREATE TABLE IF NOT EXISTS orders
(
id INT PRIMARY KEY AUTO_INCREMENT,
total INT UNSIGNED NOT NULL,
order_datetime DATETIME NOT NULL DEFAULT NOW(),
user_id INT,
FOREIGN KEY (user_id) REFERENCES users(id)
-- удаление каскадом и обновление каскадом по ключу
ON DELETE CASCADE ON UPDATE CASCADE
);

-- #3
-- добавим имя для пользователей
ALTER TABLE users
ADD username VARCHAR(15) NOT NULL DEFAULT 'Пользователь';
-- добавим поле для ссылки на таблицу
ALTER TABLE orders
ADD user_id INT;

-- но что если мы хотим изменить внешний вид ключа?
-- constraint - ограничение
-- добавим ссылку на таблицу с помощью constraint
ALTER TABLE orders
ADD CONSTRAINT orders_users_fk
FOREIGN KEY (user_id) REFERENCES users(id);
-- удалить ограничение
ALTER TABLE orders
DROP FOREIGN KEY orders_users_fk;

-- constraint при создании таблицы
CREATE TABLE IF NOT EXISTS users
(
id INT PRIMARY KEY AUTO_INCREMENT,
email VARCHAR(50) NOT NULL,
phone VARCHAR(15) NOT NULL,
password_hash VARCHAR(50) NOT NULL,
registration_date DATETIME NOT NULL DEFAULT NOW(),
);

CREATE TABLE IF NOT EXISTS orders
(
id INT PRIMARY KEY AUTO_INCREMENT,
total INT UNSIGNED NOT NULL,
order_datetime DATETIME NOT NULL DEFAULT NOW(),
user_id INT,
CONSTRAINT orders_users_fk
FOREIGN KEY (user_id) REFERENCES users(id)
);

-- #2
-- INSERT INTO users(email,phone,password_hash,registration_date) VALUES
-- ('test@mail.ru', '999-999-99-99', 'md5 hash', '2022-01-01');

-- INSERT INTO orders(total,user_id) VALUES
-- (4500, 1);

-- SELECT * FROM users;
-- SELECT * FROM orders;
-- DELETE FROM orders WHERE id = 1;
-- DELETE FROM users WHERE  id = 1;
-- UPDATE orders SET id = 2 WHERE id = 1;
-- UPDATE users SET id = 2 WHERE id = 1;

-- #1
-- добавим имя для пользователей
-- ALTER TABLE users
-- ADD username VARCHAR(15) NOT NULL DEFAULT 'Пользователь';
-- добавим поле для ссылки на таблицу
-- ALTER TABLE orders
-- ADD user_id INT;
-- добавим ссылку на таблицу
-- ALTER TABLE orders
-- ADD FOREIGN KEY (user_id) REFERENCES users(id);

-- INSERT INTO users(email,phone,password_hash,registration_date) VALUES
-- ('test@mail.ru', '999-999-99-99', 'md5 hash', '2022-01-01');

-- INSERT INTO orders(total,user_id) VALUES
-- (4500, 1);
-- SELECT * FROM users;
-- SELECT * FROM orders;
-- DELETE FROM orders WHERE id = 1;
-- DELETE FROM users WHERE id = 1;