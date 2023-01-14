insert into course (id,name) values (10001,'JPA in 50 steps');
insert into course (id,name) values (10002,'SpringBoot in 50 steps');
insert into course (id,name) values (10003,'Microservices in 50 steps');

insert into passport (id,number) values (40001, 'S12345');
insert into passport (id,number) values (40002, 'I12365');
insert into passport (id,number) values (40003, 'G45883');

insert into student (id,name,passport_id) values (20001, 'Siva',40001);
insert into student (id,name,passport_id) values (20002, 'Arjun',40002);
insert into student (id,name,passport_id) values (20003, 'Gowshick',40003);

insert into review (id, rating, description, course_id) values (50001, '5', 'Great course', 10001);
insert into review (id, rating, description, course_id) values (50002, '4', 'Good course',10002);
insert into review (id, rating, description, course_id) values (50003, '5', 'Great course',10002);
insert into review (id, rating, description, course_id) values (50004, '4', 'Good course',10003);

insert into student_course (student_id,course_id) values(20001, 10001);
insert into student_course (student_id,course_id) values(20002,10002 );
insert into student_course (student_id,course_id) values(20002,10001 );
insert into student_course (student_id,course_id) values(20003,10002 );