DROP DATABASE IF EXISTS finances;
CREATE DATABASE IF NOT EXISTS finances;
use finances;
CREATE TABLE IF NOT EXISTS phones (
  id INT PRIMARY KEY AUTO_INCREMENT,
  title VARCHAR(30),
  price INT  
);
INSERT INTO phones(title,price) VALUES
('Apple iPhone 10', 49999),
('Apple iPhone 10 Pro', 59500),
('Apple iPhone 10 Pro Max', 78999),
('Apple iPhone 11', 62300),
('Apple iPhone 11 Pro', 73499),
('Apple iPhone 11 Pro Max', 88950),
('Samsung Galaxy Note 8', 67320),
('Samsung Galaxy Note 8 Pro', 75800),
('Samsung Galaxy Note 9', 71460),
('Samsung Galaxy Note 9 Pro', 79820),
('OnePlus 7', 45670),
('OnePlus 7T', 49000),
('OnePlus 8', 55550),
('OnePlus 9T', 66250),
('Huawei P Smart 2019', 17890),
('Honor 20S', 21450),
('Razor Phone', 68900);