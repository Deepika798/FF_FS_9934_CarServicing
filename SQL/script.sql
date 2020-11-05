##################### START SCRIPT #####################
#                                                      #
# DAY #:43                                             #
# Topic : SQL										                       #
# This Script contains the database CarServicing	     #
# It Contains Tables                                   #
#                                                      #
################### END SCRIPT #########################

/* Creating DataBase */
CREATE DATABASE carservicing;
/* Using carservicing DataBase */
use carservicing;

/* Creating User Table */
create table user(FirstName varchar(15) NOT NULL,
LastName varchar(15) NOT NULL,
Age int NOT NULL,
ContactNumber varchar(15) UNIQUE,
Id int  primary key ,
Password varchar(10) NOT NULL ,
roleId int ,
FOREIGN KEY (roleId) REFERENCES role(Id));

/* Creating role Table */
CREATE TABLE role(Id int PRIMARY KEY,Name varchar(15) NOT NULL);
INSERT INTO role values(1,'User');
INSERT INTO role Values(2,'DeliveryBoy');

/* Creating ServiceCenter Table */
CREATE TABLE ServiceCenter(ID varchar(5) Primary key,
CenterName varchar(20) NOT NULL,
FullAddress varchar(30)  NOT NULL,
ContactNumber int UNIQUE, STARTDATE date NOT NULL, ENDDATE date NOT NULL,
rating float NOT NULL,
DeliveryBoyId int,
FOREIGN KEY (DeliveryBoyId) REFERENCES DeliveryBoy(Id));

/* Creating ServicesProvided Table */
CREATE TABLE ServicesProvided(ID varchar(5) primary key,
ServiceName varchar(15) NOT NULL,
ServiceCost int NOT NULL,
ServiceCenterID varchar(5) ,
FOREIGN KEY (ServiceCenterID) REFERENCES ServiceCenter(ID));


/* Creating BillDetails table */
CREATE TABLE BillDetails(ID varchar(5) UNIQUE,
BillAmount double NOT NULL,
BillDate date NOT NULL,
Userid int ,
ServiceCenterID varchar(5),
FOREIGN KEY (Userid) REFERENCES User(Id),
FOREIGN KEY (ServiceCenterID) REFERENCES ServiceCenter(ID));


/* Creating DeliveryBoyDetails Table */
CREATE Table DeliveryBoy(Id int Primary key,
Name varchar(15) NOT NULL,
PhoneNumber int UNIQUE,
roleId int ,
FOREIGN KEY (roleID) REFERENCES role(ID));
