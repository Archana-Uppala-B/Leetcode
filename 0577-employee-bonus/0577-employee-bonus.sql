# Write your MySQL query statement below
# USING THE LEFT JOIN

SELECT e.name, b.bonus
FROM Employee e LEFT JOIN Bonus b
ON e.empId = b.empId
WHERE b.bonus IS NULL 
     OR b.bonus <1000