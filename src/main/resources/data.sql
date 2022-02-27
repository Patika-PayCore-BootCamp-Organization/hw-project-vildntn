-- Table Schemas
DROP TABLE IF EXISTS hostel_reservations;
DROP TABLE IF EXISTS outdoor_events;
DROP TABLE IF EXISTS customers;
DROP TABLE IF EXISTS rooms;
DROP TABLE IF EXISTS event_reservations;
DROP TABLE IF EXISTS hostels;

CREATE TABLE hostels
(
 id       INT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
 hostel_name VARCHAR(50) NOT NULL,
 address VARCHAR(250) NOT NULL,
 room_numbers INT NOT NULL
);

CREATE TABLE rooms
(
 id       INT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
 hostel_id INT NOT NULL,
 room_number INT NOT NULL,
 room_floor INT NOT NULL,
 capacity INT NOT NULL,
FOREIGN KEY(hostel_id) REFERENCES hostels (id)
);


CREATE TABLE customers
(
 id       INT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
 room_id INT NOT NULL,
first_name VARCHAR(25) NOT NULL,
last_name VARCHAR(25) NOT NULL,
phone_number VARCHAR(20) NOT NULL,
gender VARCHAR(10) ,
email VARCHAR(50) UNIQUE NOT NULL,
FOREIGN KEY(room_id) REFERENCES rooms (id)
);



CREATE TABLE hostel_reservations
(
id       INT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
customer_id INT NOT NULL,
room_id INT NOT NULL,
arrival_date DATE NOT NULL,
departure_date DATE NOT NULL,
price INT NOT NULL,
FOREIGN KEY (customer_id) REFERENCES customers (id),
FOREIGN KEY (room_id) REFERENCES rooms (id)
);

CREATE TABLE event_reservations
(
id       INT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
hostel_id INT NOT NULL,
event_name VARCHAR(50) NOT NULL,
start_date DATE NOT NULL,
end_date DATE NOT NULL,
capacity INT,
description VARCHAR(250),
FOREIGN KEY (hostel_id) REFERENCES hostels (id)
);



CREATE TABLE outdoor_events
(
id INT NOT NULL PRIMARY KEY,
price INT NOT NULL,
FOREIGN KEY(id) REFERENCES event_reservations (id)
);


-- ////////////////////////////////////////////////////////////////////////////
--  Sample static test values
-- ////////////////////////////////////////////////////////////////////////////

INSERT INTO hostels(hostel_name,address,room_numbers)
VALUES ('Hostal La Brisa Loca Santa Marta','Santa Marta/Colombia',40),
       ('Diff Hostel', 'Bangkok/Tayland',30),
       ('Jam Hostel Bangkok','Bangkok/Tayland',30);

INSERT INTO rooms( hostel_id,room_number,room_floor,capacity)
VALUES (1,100,1,6),
       (1,101,1,4),
       (1,109,3,8);


INSERT INTO customers(room_id,first_name,last_name,phone_number, gender, email)
VALUES (1, 'Dale', 'Gomez','8156633825','Male','mauris.blandit@outlook.org'),
        (1, 'Andrew', 'Hooper','2225594207','Male','semper.nam@protonmail.ca'),
        (1,'Ayanna','Mccall','3795619325','Female','erat.volutpat@google.edu'),
        (2,'Ian','Garisson','16452436817','Male','gravida.sit.amet@aol.com'),
        (2,'Phoebe','Cannon','3746786746','Female','quisque.nonummy@hotmail.net'),
        (2,'Shelley','Cannon','07624591322','Female','nunc.sed@outlook.couk'),
        (2,'Ashely','Garrison','25408001111','Female','nec.metus@protonmail.edu'),
        (3,'Karina','Rose','08842331835','Female','est.mollis@icloud.ca'),
        (3,'Katell','Guzman','02146143310','Female','auctor.velit.aliquam@icloud.net'),
        (3,'Ramona','Sawyer','0800928532','Female','adipiscing@yahoo.org'),
        (3,'Marvin','Rice','7331501372','Male','marvin@aol.couk'),
        (3,'Lance','Ward','17216829345','Male','lance7117@protonmail.edu'),
        (3,'Xander','Gayer','4485174144','Male','xander1267@protonmail.org'),
        (3,'Julian','Delacruz','7151128297','Male','julian@google.edu'),
        (3,'Lamar','Valencia','7911622864','Male','lamar3853@outlook.com');

INSERT INTO hostel_reservations(customer_id, room_id,arrival_date,departure_date,price )
VALUES (1,1,'2021-04-14','2021-04-18',449),
       (2,1,'2021-04-14','2021-04-18',449),
       (4,2,'2021-05-14','2021-05-18',678),
       (5,2,'2021-05-24','2021-05-31',678),
       (6,2,'2021-05-24','2021-05-31',678),
       (7,2,'2021-05-14','2021-05-18',678),
       (8,3,'2021-08-09','2021-08-12',338),
       (9,3,'2021-02-04','2021-02-10',200),
       (10,3,'2021-06-02','2021-06-09',420);

