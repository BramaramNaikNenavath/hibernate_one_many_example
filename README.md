# hibernate_one_many_example
hibernate_one_many_example

Hibernate: create table ACCOUNT_C1 (ID integer not null auto_increment, ACCOUNT_NAME varchar(255), ACCOUNT_NUMBER varchar(255) not null, employee_ID integer, primary key (ID)) engine=InnoDB

Hibernate: create table Employee_C1 (ID integer not null auto_increment, EMPLOYEE_DESIG varchar(255), EMPLOYEE_EMAIL varchar(255), EMPLOYEE_NAME varchar(255), EMPLOYEE_SAL double precision, primary key (ID)) engine=InnoDB

Hibernate: alter table ACCOUNT_C1 add constraint UK_fb3d2v476yuajc2jf6crdnjt9 unique (ACCOUNT_NUMBER)
Hibernate: alter table Employee_C1 add constraint UK4k68e7mflis9k9f9cugq6302o unique (EMPLOYEE_EMAIL)
Hibernate: alter table ACCOUNT_C1 add constraint FKdhmskiqsvw1eaewtw3fgrqdr1 foreign key (employee_ID) references Employee_C1 (ID)

Hibernate: insert into Employee_C1 (EMPLOYEE_DESIG, EMPLOYEE_EMAIL, EMPLOYEE_NAME, EMPLOYEE_SAL) values (?, ?, ?, ?)
Hibernate: insert into ACCOUNT_C1 (ACCOUNT_NAME, ACCOUNT_NUMBER, employee_ID) values (?, ?, ?)
Hibernate: insert into ACCOUNT_C1 (ACCOUNT_NAME, ACCOUNT_NUMBER, employee_ID) values (?, ?, ?)

Hibernate: insert into Employee_C1 (EMPLOYEE_DESIG, EMPLOYEE_EMAIL, EMPLOYEE_NAME, EMPLOYEE_SAL) values (?, ?, ?, ?)
Hibernate: insert into ACCOUNT_C1 (ACCOUNT_NAME, ACCOUNT_NUMBER, employee_ID) values (?, ?, ?)
Hibernate: insert into ACCOUNT_C1 (ACCOUNT_NAME, ACCOUNT_NUMBER, employee_ID) values (?, ?, ?)

Hibernate: insert into Employee_C1 (EMPLOYEE_DESIG, EMPLOYEE_EMAIL, EMPLOYEE_NAME, EMPLOYEE_SAL) values (?, ?, ?, ?)
Hibernate: insert into ACCOUNT_C1 (ACCOUNT_NAME, ACCOUNT_NUMBER, employee_ID) values (?, ?, ?)

Hibernate: update ACCOUNT_C1 set EMPLOYEE_ID=? where ID=?
Hibernate: update ACCOUNT_C1 set EMPLOYEE_ID=? where ID=?
Hibernate: update ACCOUNT_C1 set EMPLOYEE_ID=? where ID=?
Hibernate: update ACCOUNT_C1 set EMPLOYEE_ID=? where ID=?
Hibernate: update ACCOUNT_C1 set EMPLOYEE_ID=? where ID=?

JoinTable:

Hibernate: create table ACCOUNT_C2 (ID integer not null auto_increment, ACCOUNT_NAME varchar(255), ACCOUNT_NUMBER varchar(255) not null, primary key (ID)) engine=InnoDB
Hibernate: create table EMPLOYEE_ACCOUNT (EmployeeC2_ID integer not null, accounts_ID integer not null, primary key (EmployeeC2_ID, accounts_ID)) engine=InnoDB
Hibernate: create table Employee_C2 (ID integer not null auto_increment, EMPLOYEE_DESIG varchar(255), EMPLOYEE_EMAIL varchar(255), EMPLOYEE_NAME varchar(255), EMPLOYEE_SAL double precision, primary key (ID)) engine=InnoDB

Hibernate: alter table ACCOUNT_C2 add constraint UK_6qrc9128gi2w0kdv3aiejtklw unique (ACCOUNT_NUMBER)
Hibernate: alter table EMPLOYEE_ACCOUNT add constraint UK_97epichk5jxx8qill4kpes44j unique (accounts_ID)
Hibernate: alter table Employee_C2 add constraint UKfi3vweroma63vy34l1xt017h2 unique (EMPLOYEE_EMAIL)
Hibernate: alter table EMPLOYEE_ACCOUNT add constraint FKlmjufl0itkmqxnd7ife8ekll3 foreign key (accounts_ID) references ACCOUNT_C2 (ID)
Hibernate: alter table EMPLOYEE_ACCOUNT add constraint FKlbhpm94xbktwe3qnae0yg0f7j foreign key (EmployeeC2_ID) references Employee_C2 (ID)

Hibernate: insert into Employee_C2 (EMPLOYEE_DESIG, EMPLOYEE_EMAIL, EMPLOYEE_NAME, EMPLOYEE_SAL) values (?, ?, ?, ?)
Hibernate: insert into ACCOUNT_C2 (ACCOUNT_NAME, ACCOUNT_NUMBER) values (?, ?)
Hibernate: insert into ACCOUNT_C2 (ACCOUNT_NAME, ACCOUNT_NUMBER) values (?, ?)

Hibernate: insert into Employee_C2 (EMPLOYEE_DESIG, EMPLOYEE_EMAIL, EMPLOYEE_NAME, EMPLOYEE_SAL) values (?, ?, ?, ?)
Hibernate: insert into ACCOUNT_C2 (ACCOUNT_NAME, ACCOUNT_NUMBER) values (?, ?)
Hibernate: insert into ACCOUNT_C2 (ACCOUNT_NAME, ACCOUNT_NUMBER) values (?, ?)

Hibernate: insert into Employee_C2 (EMPLOYEE_DESIG, EMPLOYEE_EMAIL, EMPLOYEE_NAME, EMPLOYEE_SAL) values (?, ?, ?, ?)
Hibernate: insert into ACCOUNT_C2 (ACCOUNT_NAME, ACCOUNT_NUMBER) values (?, ?)

Hibernate: insert into EMPLOYEE_ACCOUNT (EmployeeC2_ID, accounts_ID) values (?, ?)
Hibernate: insert into EMPLOYEE_ACCOUNT (EmployeeC2_ID, accounts_ID) values (?, ?)
Hibernate: insert into EMPLOYEE_ACCOUNT (EmployeeC2_ID, accounts_ID) values (?, ?)
Hibernate: insert into EMPLOYEE_ACCOUNT (EmployeeC2_ID, accounts_ID) values (?, ?)
Hibernate: insert into EMPLOYEE_ACCOUNT (EmployeeC2_ID, accounts_ID) values (?, ?)
