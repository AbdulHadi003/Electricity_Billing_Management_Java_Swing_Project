create database signup;
USE `signup`;

CREATE TABLE `login` (
  `meter_no` varchar(20) DEFAULT NULL,
  `username` varchar(20) DEFAULT NULL,
  `name` varchar(30) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL,
  `user` varchar(20) DEFAULT NULL
);
select * from login;
create table customer (name varchar(20), meter_no varchar(20),address varchar(50),city varchar(20),state varchar(20), email varchar(40) , phone varchar(20));
select * from customer;
create table meter_info(meter_no varchar(20), meter_location varchar(20),meter_type varchar(20),phase_code varchar(20),bill_type varchar(20), days varchar(20));
select * from meter_info;
create table tax(cost_per_unit varchar(20), meter_rent varchar(20),service_charge varchar(20),service_tax varchar(20),kmc_cost varchar(20), fixed_tax varchar(20));
insert into tax values('25','100','100','50','50','100');
select * from tax;
create table bill(meter_no varchar(20), month varchar(20),units varchar(20), total_bill varchar(20),status varchar(20));
select * from bill; 