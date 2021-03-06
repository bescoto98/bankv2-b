INSERT INTO USER(userid,firstname,lastname,username,password,role) VALUES(100,'Eagan','Short','shor54','password','ADMIN');
INSERT INTO USER(userid,firstname,lastname,username,password,role) VALUES(101,'Jerome','Holder','hold68','password','ADMIN');
INSERT INTO USER(userid,firstname,lastname,username,password,role) VALUES(102,'Hamish','Henry','henr89','password','EMPLOYEE');
INSERT INTO USER(userid,firstname,lastname,username,password,role) VALUES(103,'Carl','Burgess','burg76','password','EMPLOYEE');
INSERT INTO USER(userid,firstname,lastname,username,password,role) VALUES(104,'Philip','Bauer','baue54','password','EMPLOYEE');
INSERT INTO USER(userid,firstname,lastname,username,password,role) VALUES(105,'Bradley','Riggs','rigg93','password','EMPLOYEE');
INSERT INTO USER(userid,firstname,lastname,username,password,role) VALUES(106,'Wang','Rocha','roch63','password','CUSTOMER');
INSERT INTO USER(userid,firstname,lastname,username,password,role) VALUES(107,'Clinton','Hughes','hugh59','password','CUSTOMER');
INSERT INTO USER(userid,firstname,lastname,username,password,role) VALUES(108,'Ahmed','Stevenson','stev96','password','CUSTOMER');
INSERT INTO USER(userid,firstname,lastname,username,password,role) VALUES(109,'Hilel','Drake','drak57','password','CUSTOMER');
INSERT INTO USER(userid,firstname,lastname,username,password,role) VALUES(110,'Clark','Rich','rich53','password','CUSTOMER');
INSERT INTO USER(userid,firstname,lastname,username,password,role) VALUES(111,'Byron','Byers','byer50','password','CUSTOMER');
INSERT INTO USER(userid,firstname,lastname,password,username,role) VALUES(112,'Ellen','Veras','password','veras123','EMPLOYEE');
INSERT INTO USER(userid,firstname,lastname,password,username,role) VALUES(113,'John','Doe','password','jdoe','ADMIN');
INSERT INTO USER(userid,firstname,lastname,password,username,role) VALUES(114,'Steven','Oregano','password','stevie','CUSTOMER');

INSERT INTO INFORMATION(userid,ssn,address,city,state,zip,phone,email) VALUES(100,'595962970','154 Red St.','Orange','CA','03986','150206091','short@gmail.com');
INSERT INTO INFORMATION(userid,ssn,address,city,state,zip,phone,email) VALUES(101,'433218922','302 Blue St.','New York','NY','96451','958278489','holder@gmail.com');
INSERT INTO INFORMATION(userid,ssn,address,city,state,zip,phone,email) VALUES(102,'101912760','215 Orange St.','Dallas','TX','52263','178207326','henry@gmail.com');
INSERT INTO INFORMATION(userid,ssn,address,city,state,zip,phone,email) VALUES(103,'926713517','372 Big Ave.','Houston','TX','94377','270294217','burgess@gmail.com');
INSERT INTO INFORMATION(userid,ssn,address,city,state,zip,phone,email) VALUES(104,'620663526','306 Bristol St.','Phoenix','AZ','93447','286480196','bauer@gmail.com');
INSERT INTO INFORMATION(userid,ssn,address,city,state,zip,phone,email) VALUES(105,'236665050','308 Bristol St.','Phoenix','AZ','93447','4745652222','riggs@gmail.com');
INSERT INTO INFORMATION(userid,ssn,address,city,state,zip,phone,email) VALUES(106,'700635420','241 Purple St.','Los Angeles','CA','09465','174684890','rocha@gmail.com');
INSERT INTO INFORMATION(userid,ssn,address,city,state,zip,phone,email) VALUES(107,'708964341','128 Yellow Brick Ave.','Los Angeles','CA','47919','352972598','hughes@gmail.com');
INSERT INTO INFORMATION(userid,ssn,address,city,state,zip,phone,email) VALUES(108,'861576399','393 South Drive','New York','NY','18135','914532540','stevenson@gmail.com');
INSERT INTO INFORMATION(userid,ssn,address,city,state,zip,phone,email) VALUES(109,'914365218','445 Blueish Ave.','Phoenix','AZ','11510','605157488','drake@gmail.com');
INSERT INTO INFORMATION(userid,ssn,address,city,state,zip,phone,email) VALUES(110,'303305548','193 Red Ave.','Dallas','TX','46410','626847550','rich@gmail.com');
INSERT INTO INFORMATION(userid,ssn,address,city,state,zip,phone,email) VALUES(111,'899425123','612 Orange Ave.','Orange','CA','99334','492332192','byers@gmail.com');
INSERT INTO INFORMATION(userid,ssn,address,city,state,zip,phone,email) VALUES(112,'505226595','613 Orange Ave.','Orange','CA','99334','5219653663','veras@gmail.com');
INSERT INTO INFORMATION(userid,ssn,address,city,state,zip,phone,email) VALUES(113,'555002365','614 Orange Ave.','Orange','CA','99334','5845698521','doe@gmail.com');
INSERT INTO INFORMATION(userid,ssn,address,city,state,zip,phone,email) VALUES(114,'485662000','615 Orange Ave.','Orange','CA','99334','2851412563','oregano@gmail.com');

INSERT INTO ACCOUNT(accountid,approvedby,balance,createdon,status,type,userid) VALUES(107,'Eagan Short',500.00,'10-15-2015','OPEN','CHECKING',107);
INSERT INTO ACCOUNT(accountid,approvedby,balance,createdon,status,type,userid) VALUES(108,'Jerome Holder',700.00,'08-15-2012','OPEN','SAVINGS',111);
INSERT INTO ACCOUNT(accountid,approvedby,balance,createdon,status,type,userid) VALUES(109,'Hamish Henry',458.00,'12-11-2013','OPEN','CHECKING',110);
INSERT INTO ACCOUNT(accountid,approvedby,balance,createdon,status,type,userid) VALUES(110,'Carl Burgess',4568.44,'03-25-2014','OPEN','SAVINGS',111);
INSERT INTO ACCOUNT(accountid,approvedby,balance,createdon,status,type,userid) VALUES(111,'Philip Bauer',45683.45,'02-23-2016','OPEN','CHECKING',106);
INSERT INTO ACCOUNT(accountid,approvedby,balance,createdon,status,type,userid) VALUES(112,'Bradley Riggs',1200.23,'01-09-2017','OPEN','SAVINGS',114);
INSERT INTO ACCOUNT(accountid,approvedby,balance,createdon,status,type,userid) VALUES(113,'Ellen Veras',4562.11,'05-15-2008','OPEN','CHECKING',109);
