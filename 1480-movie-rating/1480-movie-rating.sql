# Write your MySQL query statement below
SELECT results FROM (
    SELECT u.name as results 
    FROM MovieRating m 
    JOIN Users u ON m.user_id = u.user_id
    GROUP BY M.USER_id 
    ORDER BY Count(m.user_id) desc, u.name 
    LIMIT 1
) AS subquery1

UNION ALL

SELECT results FROM (
    SELECT mv.title as results
    FROM MovieRating m join Movies mv on m.movie_id = mv.movie_id 
    where MONTH(created_at) = 02 AND YEAR(created_at) = 2020
    GROUP BY mv.title
    ORDER BY AVG(m.rating) DESC, mv.title ASC 
    LIMIT 1
) AS subquery2;