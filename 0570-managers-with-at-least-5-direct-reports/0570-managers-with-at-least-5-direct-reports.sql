# Write your MySQL query statement below

# SELECT name
# FROM Employee e1 
# JOIN (SELECT managerId, COUNT(*) FROM Employee GROUP BY managerId HAVING COUNT(*)>=5) e2 
# ON e1.id=e2.managerId;

SELECT e1.name
FROM Employee e1
CROSS JOIN Employee e2
WHERE e1.id=e2.managerId GROUP BY e2.managerId HAVING COUNT(*)>=5;
