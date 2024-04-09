CREATE DATABASE api_business_tour_management;
USE api_business_tour_management;

CREATE TABLE Account(
	account_id bigint primary key,
	username nvarchar(255) not null,
	password nvarchar(255) not null,
	role nvarchar(255) not null
);

CREATE TABLE faculty(
	faculty_id varchar(20) primary key, 
	faculty_name varchar(255)
);

CREATE TABLE Classroom(
	class_id varchar(20) primary key,
	class_name varchar(255),
	faculty_id varchar(20),
    foreign key (faculty_id) references faculty(faculty_id) On DELETE CASCADE
);

CREATE TABLE Student(
	student_id bigint primary key,
	address varchar(255), 
	birth_date varchar(255), 
	email varchar(255), 
	full_name varchar(255), 
	image_path varchar(255), 
	phone_number varchar(255), 
	account_id bigint,
	classroom_id varchar(20),
	foreign key (account_id) references Account(account_id) On DELETE CASCADE,
    foreign key (classroom_id) references Classroom(class_id) On DELETE CASCADE 
);

CREATE TABLE Company(
	company_id varchar(20) primary key, 
	address varchar(255),
	company_name varchar(255), 
	description varchar(255),
	email varchar(255),
	image_path varchar(255), 
	phone_number varchar(255)
);

CREATE TABLE teacher(
    teacher_id bigint primary key,  
	address varchar(255),
	birth_date varchar(255) ,
	email varchar(255) ,
	full_name varchar(255) ,
	image_path varchar(255) ,
	phone_number varchar(255) ,
	account_id bigint ,
	faculty_id varchar(20),
    foreign key (account_id) references Account(account_id) On DELETE CASCADE,
    foreign key (faculty_id) references faculty(faculty_id) On DELETE CASCADE
);

CREATE TABLE tour(
	tour_id varchar(20) primary key, 
	description varchar(255) ,
	number_of_people int ,
	presenter varchar(255) ,
	start_date varchar(255) ,
	tour_name varchar(255) ,
	company_id varchar(20),
	Foreign key (company_id) references Company(company_id) On DELETE CASCADE
);

CREATE TABLE student_tour(
	id bigint auto_increment primary key, 
	rate int ,
	student_id bigint ,
	tour_id varchar(20),
	Foreign key (student_id) references Student(student_id) On DELETE CASCADE,
	Foreign key (tour_id) references Tour(tour_id) On DELETE CASCADE
);

CREATE TABLE teacher_tour(
	id bigint auto_increment primary key,
	teacher_id bigint ,
	tour_id varchar(20),
	Foreign key (teacher_id) references Teacher(teacher_id) On DELETE CASCADE,
	Foreign key (tour_id) references Tour(tour_id) On DELETE CASCADE
);

