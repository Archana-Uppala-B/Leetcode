# Write your MySQL query statement below
# USING THE LEFT JOIN OF TWO TABLES

SELECT v.customer_id, count(*) AS count_no_trans
FROM Visits v LEFT JOIN Transactions t 
ON t.visit_id=v.visit_id    
WHERE t.transaction_id IS NULL GROUP BY v.customer_id;