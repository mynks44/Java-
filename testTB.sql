CREATE DATABASE testdb;

USE testdb;

CREATE TABLE employees (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50),
    position VARCHAR(50),
    salary DOUBLE
);

INSERT INTO employees (name, position, salary) VALUES ('Alice', 'Developer', 75000);
INSERT INTO employees (name, position, salary) VALUES ('Bob', 'Designer', 68000);
INSERT INTO employees (name, position, salary) VALUES ('Charlie', 'Manager', 85000);
