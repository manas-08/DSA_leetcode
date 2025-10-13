# Write your MySQL query statement below
-- select name from employee 
-- where id in (select managerId from employee group by managerId having count(managerId) > 4);

select t2.name from Employee t1 inner join
Employee t2 on t1.managerId = t2.id 
group by t1.managerId having count(t1.managerId) > 4;