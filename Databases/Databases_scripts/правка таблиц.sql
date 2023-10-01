DROP DATABASE IF EXISTS my_service;
CREATE DATABASE IF NOT EXISTS my_service;
USE my_service;
DROP TABLE IF EXISTS users;
CREATE TABLE IF NOT EXISTS users
(
id INT PRIMARY KEY AUTO_INCREMENT,
email VARCHAR(50) NOT NULL,
phone VARCHAR(15) NOT NULL,
password_hash VARCHAR(50) NOT NULL,
registration_date DATETIME NOT NULL DEFAULT NOW(),
first_name VARCHAR(50) NOT NULL,
last_name VARCHAR(50) NULL
);
SHOW TABLES;
DESCRIBE users;
-- изменить название таблицы
ALTER TABLE users
RENAME TO users_new;
-- добавить столбец
ALTER TABLE users
ADD COLUMN birthdate DATE NOT NULL;
-- тоже самое
ALTER TABLE users
ADD birthdate DATE NOT NULL;
-- добавить несколько стольбцов
ALTER TABLE users
ADD birthdate DATE NOT NULL,
ADD age TINYINT UNSIGNED NOT NULL;
-- добавить столбец на первое место
ALTER TABLE users
ADD COLUMN birthdate DATE NOT NULL FIRST;
-- добавить столбец после конкретного стобца
ALTER TABLE users
ADD COLUMN birthdate DATE NOT NULL AFTER phone;
-- удалить столбец
ALTER TABLE users
DROP COLUMN birthdate; -- COLUMN обязательно в отличии от ADD
-- изменить атрибуты столбца
ALTER TABLE users
MODIFY birthdate DATE NULL;
-- изменить типы переменных столбца
ALTER TABLE users
ADD age TINYINT NULL,
ADD bio TINYTEXT NOT NULL;
ALTER TABLE users -- изменяем
MODIFY age TINYINT UNSIGNED,
MODIFY bio VARCHAR(140) NULL;
-- изменить название столбца
ALTER TABLE users
CHANGE phone phone_number VARCHAR(15) NOT NULL;
