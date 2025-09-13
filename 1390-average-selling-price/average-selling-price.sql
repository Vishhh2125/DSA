# Write your MySQL query statement below

select p.product_id, ifnull(round(sum(t.sales)/sum(t.total_units_for_a_price),2),0) as average_price
from
(
  select   p.product_id , sum(u.units) as total_units_for_a_price, sum(u.units* p.price) as sales
from Prices as p 
left join UnitsSold as u 
on p.product_id =u.product_id
where u.purchase_date between  p.start_date and p.end_date
group by p.product_id , p.price 
) as  t

right join Prices as p 
on p.product_id =t.product_id
group by p.product_id;
