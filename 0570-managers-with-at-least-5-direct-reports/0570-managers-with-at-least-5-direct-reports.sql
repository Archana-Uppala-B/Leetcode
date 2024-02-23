# Write your MySQL query statement below
select name from Employee e1 
Join (select managerId, count(*) from Employee group by managerId having count(*)>=5) e2 
on e1.id=e2.managerId;