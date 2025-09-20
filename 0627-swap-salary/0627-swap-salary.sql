/* Write your PL/SQL query statement below */

UPDATE Salary 
set sex = case sex
when 'm' then 'f'
when 'f' then 'm'
end;