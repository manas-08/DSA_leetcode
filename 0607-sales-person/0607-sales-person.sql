# Write your MySQL query statement below
select name from Salesperson where name not in (select s.name from 
SalesPerson as s left join Orders as o on s.sales_id = o.sales_id
inner join Company as c on o.com_id = c.com_id
where c.name = 'RED');
