DROP TABLE transactions IF exists;

create table transactions (

transaction_id varchar(50) not null primary key,
trader_id varchar(7),
system_name varchar(10),
region varchar(5),
product_name varchar(10),
curr_1 varchar(3),
curr_2 varchar(3),
notional BIGINT

);