# Write your MySQL query statement below
select*from cinema where id%2=1 AND description NOT IN('boring') order by rating desc;