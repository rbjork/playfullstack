
drop table "people" if exists;
drop table "checkins" if exists
drop table "health" if exists
drop table "recommendation" if exists
drop table "checkinhealth" if exists

# --- !Ups

create table "people" (
  "id" bigint generated by default as identity(start with 1) not null primary key,
  "name" varchar(255) not null,
  "age" int not null
);

create table "checkins" (
   "id" bigint generated by default as identity(start with 1) not null primary key,
   "patientID" bigint not null,
   "checkInTime" bigint not null,
   "canEatDrink" boolean not null
);



create table "CHECKINHEALTH" (
    "ID" bigint generated by default as identity(start with 1) not null primary key,
    "PATIENTID" bigint not null,
    "CHECKINTIME" bigint not null,
    "PAINLEVEL" varchar(255) not null,
    "CANEATDRINK" boolean not null
);

create table "HEALTH" (
    "ID" bigint generated by default as identity(start with 1) not null primary key,
    "CKINID" bigint not null,
    "PRESCRIPTION" varchar(255) not null,
    "TAKEN" boolean not null,
    "TIMETAKEN" bigint not null
);

create table "RECOMMENDATION" (
    "ID" bigint generated by default as identity(start with 1) not null primary key,
    "INSTRUCTIONS" varchar(255) not null,
    "DOCTORS_NAME" varchar(255) not null,
    "PATIENT_ID" bigint not null,
    "RXNUMBER" varchar(255) not null,
    "DOSAGE" varchar(255) not null,
    "CURRENT" boolean not null
);


# --- !Downs

drop table "people" if exists;
drop table "checkins" if exists
drop table "HEALTH" if exists
drop table "RECOMMENDATION" if exists
drop table "CHECKINHEALTH" if exists
