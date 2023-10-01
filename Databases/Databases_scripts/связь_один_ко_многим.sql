CREATE TABLE t11 (
  id INT PRIMARY KEY AUTO_INCREMENT,
  title VARCHAR(30)
);
CREATE TABLE t22 (
  id INT PRIMARY KEY AUTO_INCREMENT,
  description VARCHAR(200),
  title_id INT,
  FOREIGN KEY (title_id) REFERENCES t11(id)
);