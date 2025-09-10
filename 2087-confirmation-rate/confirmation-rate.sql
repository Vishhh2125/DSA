# Write your MySQL query statement below
select 
       table1.user_id,
      (case 
            when table2.total_no is null or table2.confirmed_no is null 
                    then 0 
            else
                 round(table2.confirmed_no/table2.total_no,2) 
            end  
            ) 
     as confirmation_rate
from Signups as table1
left join (
    select user_id ,count(case when action='confirmed' then 1 end ) as confirmed_no,count(action) as total_no
    from Confirmations
    group by user_id 
) as table2
on table1.user_id =table2.user_id;