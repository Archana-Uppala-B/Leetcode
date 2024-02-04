# Write your MySQL query statement below
select st.student_id ,st.student_name,s.subject_name,count(e.subject_name) as attended_exams 
from Students st 
CROSS JOIN Subjects s 
LEFT JOIN Examinations e
on st.student_id=e.student_id and e.subject_name=s.subject_name
group by st.student_id,st.student_name, s.subject_name
order by st.student_id, s.subject_name;

# SELECT s.student_id, s.student_name, u.subject_name, COUNT(e.subject_name) AS attended_exams
# FROM Students AS s
# CROSS JOIN Subjects AS u
# LEFT JOIN Examinations AS e ON s.student_id = e.student_id AND u.subject_name = e.subject_name
# GROUP BY s.student_id, s.student_name, u.subject_name
# ORDER BY s.student_id, u.subject_name;

