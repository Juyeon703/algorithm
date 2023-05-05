-- 코드를 입력하세요
SELECT a.product_id, a.product_name, SUM(a.price * b.amount) AS total_sales
FROM food_product a JOIN food_order b ON a.product_id = b.product_id
WHERE DATE_FORMAT(produce_date, "%Y-%m") = '2022-05'
GROUP BY product_id
ORDER BY total_sales DESC, product_id;