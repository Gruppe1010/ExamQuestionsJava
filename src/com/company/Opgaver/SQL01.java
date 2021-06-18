package com.company.Opgaver;
//  Eriks exam like questions. SQL.
public class SQL01 {
/*
-------------------------------------------------
S1. Is it easy to implement inheritance in SQL ?

+ nej
-------------------------------------------------
S2. Mention other problems in ORM ?

-------------------------------------------------
S3. What are the 2 major types of commands in sql ?

+ SELECT
+ INSERT INTO
-------------------------------------------------
S4. What sql could be used to copy all data from one table into another table.

+ INSERT INTO table2
+ SELECT * FROM table1
-------------------------------------------------
S5. You have 2 tables.
  classes which contain all classes that KEA supports for datamatiker.
  and
  student

create a table that defines which students are related to which classes.

+ Vi opretter en many-to-many tabel hvor id_class og id_student er foreign keys der referere til hver sin table i den nye
-------------------------------------------------
S6. Inspired by S5, create a sql statement that shows all students in a certain class.

+ SELECT distinct s.id_student, student_name FROM student s JOIN student_classes sc ON s.id_student WHERE id_classes = 1;
-------------------------------------------------
S7. Write one line of sql code that adds a varchar column to a table.
    and the column should not allow Null values, and default value should be 'x'

+ ALTER TABLE student ADD addcolumn VARCHAR(255) NOT NULL DEFAULT "x";
-------------------------------------------------
S8. Write a line of sql code that creates a new database.

+ CREATE DATABASE newdb;
-------------------------------------------------
S9. Write a line of sql code that removes the above database.
! Syntax for DROP: DROP OBJECT_TYPE [ IF EXISTS ] OBJECT_NAME
// https://sqlhints.com/tag/drop-table-if-exists/


+ DROP DATABASE IF EXIST newdb;
-------------------------------------------------
S10. Write the shortest possible line of sql that creates a new table.

+ CREATE TABLE newtable(col1 VARCHAR(255));
-------------------------------------------------
S11. Write the shortest possible line of sql that creates a new table with a primary key.

+ CREATE TABLE newtable1(col1 INT NOT NULL, PRIMARY KEY(`bent`));
-------------------------------------------------
S12. Write sql that removes the above table.

+ DROP TABLE IF EXISTS newtable;
-------------------------------------------------
S13. What is an index in a table

-------------------------------------------------
S14. What kind of a datastructure is used to store an index ?

-------------------------------------------------
S15. Mention the 5 easiest keywords to explain in sql, used in an aggregate function.

-------------------------------------------------
S16. What does an aggregate function do.

-------------------------------------------------
S17. What two kind of concepts in sql do you often use aggregate functions.

-------------------------------------------------


     */



}
