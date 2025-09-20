select customer_number from (select *, rank() over(order by count(customer_number) desc) as 'rank' from Orders group by customer_number) t
where t.rank = 1;