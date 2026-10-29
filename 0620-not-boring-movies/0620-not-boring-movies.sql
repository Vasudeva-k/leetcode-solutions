# Write your MySQL query statement below
select*from cinema where id%2!=0 AND description NOT IN('boring') order by rating desc;