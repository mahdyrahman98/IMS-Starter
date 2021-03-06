drop schema ims;

CREATE SCHEMA IF NOT EXISTS `ims`;

USE `ims` ;

CREATE TABLE IF NOT EXISTS `ims`.`customers` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `first_name` VARCHAR(40) DEFAULT NULL,
    `surname` VARCHAR(40) DEFAULT NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS item (
item_id INT NOT NULL AUTO_INCREMENT,
item_name CHAR(50) NOT NULL,
price DECIMAL (7, 2) NOT NULL,
PRIMARY KEY (item_id)
);

CREATE TABLE IF NOT EXISTS orders (
order_id INT NOT NULL AUTO_INCREMENT,
customer_id INT NOT NULL,
PRIMARY KEY (order_id),
FOREIGN KEY (customer_id) REFERENCES customers(id)
);

CREATE TABLE IF NOT EXISTS orderitems (
order_id INT NOT NULL,
item_id INT NOT NULL, 
item_quantity INT NOT NULL,
FOREIGN KEY (order_id) REFERENCES orders(order_id),
FOREIGN KEY (item_id) REFERENCES item(item_id)
);



SELECT i.item_id, i.item_name, i.price, y.order_id, y.item_quantity
FROM item i
LEFT OUTER JOIN orderitems y ON i.item_id = y.item_id;