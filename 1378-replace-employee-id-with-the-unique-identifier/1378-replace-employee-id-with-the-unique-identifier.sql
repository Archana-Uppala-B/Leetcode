# Write your MySQL query statement below
select eu.unique_id,e.name from Employees e LEFT JOIN EmployeeUNI eu on
e.id=eu.id;