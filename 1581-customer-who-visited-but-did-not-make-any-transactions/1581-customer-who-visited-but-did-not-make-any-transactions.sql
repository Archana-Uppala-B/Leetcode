# Write your MySQL query statement below
# USING THE LEFT JOIN OF TWO TABLES

# SELECT v.customer_id, count(*) AS count_no_trans
# FROM Visits v LEFT JOIN Transactions t 
# ON v.visit_id = t.visit_id 
# WHERE t.transaction_id IS NULL GROUP BY v.customer_id;


SELECT customer_id, count(*) As count_no_trans
FROM Visits
WHERE visit_id NOT IN
(SELECT visit_id FROM Transactions) GROUP BY customer_id; 