--#1
SELECT * FROM northwinds.customers;
--#2
SELECT DISTINCT country_region FROM northwind.customers;
--#3
SELECT ID from  northwind.customers where 'B';

--#4
SELECT * FROM northwind.orders limit 0, 100;

--#5
SELECT * FROM customers where ship_zip_postal_code in(1010,3012,12209,05023);

--#6
SELECT * FROM northwind.orders where ship_country_region is not null;

--#7
select * from customers order by country_region and city;

--#8
insert into northwind.customers 
(id, company, last_name,first_name)
values( '30','companyXX', 'Roy', 'Krishna');
 
--#9
UPDATE northwind.orders
SET ship_zip_postal_code = 97201
WHERE ship_city= 'Portland';

--#10
DELETE FROM northwind.order_details
WHERE quantity = 1;

--#11
SELECT AVG (quantity) FROM northwind.order_details;
SELECT MIN (quantity) FROM northwind.order_details;
SELECT MAX (quantity) FROM northwind.order_details;

--#12
SELECT avg(quantity)
FROM northwind.order_details
GROUP BY order_id;
SELECT MIN(quantity)
FROM northwind.order_details
GROUP BY order_id;
SELECT MAX(quantity)
FROM northwind.order_details
GROUP BY order_id;

--#13
SELECT CUSTOMER_ID FROM northwind.orders 
WHERE ID=65;

---#14
SELECT northwind.customers(last_name) FROM northwind.customers
INNER JOIN northwind.orders
ON northwind.customers(ID) = northwind.orders(customer_id);

--#15
SELECT northwind.employees.first_name from employees where notes = null;

--#16
SELECT northwind.employees.first_name from employees where notes = null;
--#17
SELECT northwind.customers(first_name)
FROM northwind.customers
FULL JOIN northwind.orders
ON northwind.customers(ID)=northwind.orders(customer_id);

SELECT customers.first_name
FROM northwind.customers
FULL JOIN northwind.orders
ON customers.ID=orders.customer_id;



