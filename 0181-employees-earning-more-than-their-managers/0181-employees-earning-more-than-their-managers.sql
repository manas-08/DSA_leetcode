# Write your MySQL query statement below
select e1.name as Employee from employee e1 
join employee e2 on e1.managerId = e2.id and e1.salary > e2.salary and e2.salary is NOT NULL;