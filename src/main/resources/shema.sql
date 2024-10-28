CREATE TABLE CUSTOMERS (
                           id SERIAL PRIMARY KEY,
                           name VARCHAR(50) NOT NULL,
                           surname VARCHAR(50) NOT NULL,
                           age INT CHECK(age >= 0),
                           phone_number VARCHAR(15)
);