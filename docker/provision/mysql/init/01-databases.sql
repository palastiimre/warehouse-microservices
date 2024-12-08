-- create databases
CREATE DATABASE IF NOT EXISTS `product-service_db`;
CREATE DATABASE IF NOT EXISTS `order-service_db`;
CREATE DATABASE IF NOT EXISTS `inventory-service_db`;

-- create root user and grant rights
CREATE USER 'root'@'localhost'  IDENTIFIED BY 'test1234';
GRANT ALL ON *.* TO 'root'@'localhost';