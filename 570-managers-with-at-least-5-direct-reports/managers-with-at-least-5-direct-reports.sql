# Write your MySQL query statement below
select t2.name
from 
(select  managerId ,count(managerId)
from Employee 
where managerId is not null
group by managerId
having count(managerId)>=5
)
as t1
join Employee as t2
on t2.id=t1.managerId;

