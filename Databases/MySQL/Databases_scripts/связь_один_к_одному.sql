CREATE TABLE t1 (
  id INT PRIMARY KEY AUTO_INCREMENT,
  title VARCHAR(30)
);
CREATE TABLE t2 (
  id INT PRIMARY KEY,
  description VARCHAR(200),
  FOREIGN KEY (id) REFERENCES t1(id)
);

insert into t1 (title) values
('asfhh'),
('asfhh'),
('asfhh'),
('asfhh'),
('asfhh');
select * from t1;
delete from t1 where id = 2;
insert into t1 (title) values
('xbbxbbxc'),
('zxvczbv'),
('awwretw'),
('azasgbsh'),
('asga');
select * from t1;