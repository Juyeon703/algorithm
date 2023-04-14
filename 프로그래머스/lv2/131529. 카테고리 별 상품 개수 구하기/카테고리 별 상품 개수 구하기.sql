-- 코드를 입력하세요
SELECT LEFT(product_code, 2) AS category, COUNT(LEFT(product_code, 2)) AS products
FROM product
GROUP BY category
ORDER BY product_code;