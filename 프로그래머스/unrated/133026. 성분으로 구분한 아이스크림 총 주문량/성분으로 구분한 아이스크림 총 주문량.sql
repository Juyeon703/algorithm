-- 코드를 입력하세요
SELECT b.ingredient_type, SUM(a.total_order) AS total_order
FROM first_half a 
  LEFT JOIN icecream_info b 
  ON a.flavor = b.flavor
GROUP BY ingredient_type
ORDER BY total_order;