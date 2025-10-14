# Write your MySQL query statement below
with cte as(
    SELECT player_id, MIN(event_date) as first_login from Activity
    group by player_id
)
select round(count(DISTINCT A.player_id)/(SELECT count(DISTINCT player_id) from Activity),2) as fraction from Activity A inner join cte c
on A.player_id = C.player_id and datediff(A.event_date, c.first_login) = 1