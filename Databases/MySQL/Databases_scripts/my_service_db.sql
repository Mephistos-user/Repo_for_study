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
first_name VARCHAR(50) NOT NULL,
last_name VARCHAR(50) NULL
);

CREATE TABLE IF NOT EXISTS favourite_shops
(
user_id INT,
shop_id INT,
PRIMARY KEY(user_id, shop_id)
);

CREATE TABLE IF NOT EXISTS favourite_products
(
user_id INT,
product_id INT,
PRIMARY KEY(user_id, product_id)
);

CREATE TABLE IF NOT EXISTS shops
(
id INT PRIMARY KEY AUTO_INCREMENT,
title VARCHAR(50) NOT NULL,
address VARCHAR(70) NOT NULL,
working_hours VARCHAR(10) NOT NULL
);

CREATE TABLE IF NOT EXISTS products
(
id INT PRIMARY KEY AUTO_INCREMENT,
title VARCHAR(50) NOT NULL,
price INT UNSIGNED NOT NULL,
discount TINYINT UNSIGNED NOT NULL DEFAULT 0,
factory_id INT
);

CREATE TABLE IF NOT EXISTS factories
(
id INT PRIMARY KEY AUTO_INCREMENT,
title VARCHAR(100) NOT NULL,
address VARCHAR(70) NOT NULL,
registration_date DATETIME NOT NULL DEFAULT NOW()
);

CREATE TABLE IF NOT EXISTS buckets
(
user_id INT,
product_id INT,
PRIMARY KEY(user_id, product_id)
);

CREATE TABLE IF NOT EXISTS orders
(
id INT PRIMARY KEY AUTO_INCREMENT,
total_with_discount INT UNSIGNED NOT NULL,
discount TINYINT UNSIGNED NOT NULL DEFAULT 0,
order_datetime DATETIME NOT NULL DEFAULT NOW(),
user_id INT
);

CREATE TABLE IF NOT EXISTS shops_products
(
shop_id INT,
product_id INT,
PRIMARY KEY(shop_id, product_id)
);

CREATE TABLE IF NOT EXISTS orders_products
(
order_id INT,
product_id INT,
PRIMARY KEY(order_id, product_id)
);