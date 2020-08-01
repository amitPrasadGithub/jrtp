insert into country (country_id, country_name, country_code) values(1, 'India', '+91');
insert into country (country_id, country_name, country_code) values(2, 'USA', '+1');

insert into state (state_id, state_name, country_id) values (1, 'Maharashtra', 1);
insert into state (state_id, state_name, country_id) values (2, 'Rajsthan', 1);

insert into state (state_id, state_name, country_id) values (3, 'Utah', 2);
insert into state (state_id, state_name, country_id) values (4, 'Boston', 2);

insert into city (city_id, city_name, state_id) values (1, 'Nagpur', 1);
insert into city (city_id, city_name, state_id) values (2, 'Pune', 1);
insert into city (city_id, city_name, state_id) values (3, 'Kota', 2);
insert into city (city_id, city_name, state_id) values (4, 'Jaipur', 2);

insert into city (city_id, city_name, state_id) values (5, 'Riverdale', 3);
insert into city (city_id, city_name, state_id) values (6, 'Hells Kitchen', 3);
insert into city (city_id, city_name, state_id) values (7, 'Boston North', 4);
insert into city (city_id, city_name, state_id) values (8, 'Boston East', 4);

insert into contact_entity (contact_id, status, email) values (1, 'Locked', 'amit.prasad@vb.com');