# Write your MySQL query statement below
WITH rankedDelivery AS (
    SELECT *, ROW_NUMBER() OVER (PARTITION BY customer_id ORDER BY order_date  ASC) AS rn
     FROM Delivery   
) SELECT ROUND(SUM(IF(order_date = customer_pref_delivery_date,1,0)) / SUM(1) * 100 ,2) immediate_percentage  FROM rankedDelivery WHERE rn = 1;