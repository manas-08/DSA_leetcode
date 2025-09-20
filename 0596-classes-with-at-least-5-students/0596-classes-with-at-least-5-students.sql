# Write your MySQL query statement below
-- select class
-- from (
--     select class, count(student) as student_count
--     from Courses
--     group by class
-- ) as t
-- where t.student_count >= 5;

select class from Courses 
group by class having count(student) >= 5;