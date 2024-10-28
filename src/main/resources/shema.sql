CREATE TABLE IF NOT EXISTS CUSTOMERS (
                           id SERIAL PRIMARY KEY,
                           name VARCHAR(50) NOT NULL,
                           surname VARCHAR(50) NOT NULL,
                           age INT CHECK(age >= 0),
                           phone_number VARCHAR(15)
);
CREATE TABLE IF NOT EXISTS ORDERS(
                       id SERIAL PRIMARY KEY,
                       date DATE DEFAULT CURRENT_DATE,
                       customer_id int,
                       product_name VARCHAR(30) NOT NULL,
                       amount INT CHECK (amount >= 0),
                       FOREIGN KEY (customer_id) REFERENCES customers (id)
);