-- SELECT d.name AS Department, e.name AS Employee, e.salary AS Salary
-- FROM Employee e
-- INNER JOIN Department d ON e.departmentId = d.id
-- WHERE e.salary = (
--     SELECT MAX(salary)
--     FROM Employee
--     WHERE departmentId = e.departmentId
-- );


SELECT d.name AS Department, e.name AS Employee, e.salary AS Salary
FROM Employee e
INNER JOIN Department d ON e.departmentId = d.id
where (e.departmentId, e.salary) in (select departmentId, max(salary)
from employee group by departmentId);