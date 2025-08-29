create database airlinesystem;

use airlinesystem;
create table user_details (
	user_id bigint AUTO_INCREMENT PRIMARY KEY,
    first_name varchar(30) NOT NULL,
    last_name varchar(30) NOT NULL,
    phone_number varchar(10) NOT NULL,
    email_id varchar(30) NOT NULL,
    type varchar(10) NOT NULL
);