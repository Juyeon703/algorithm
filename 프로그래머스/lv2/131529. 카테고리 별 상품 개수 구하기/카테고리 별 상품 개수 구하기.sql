-- 코드를 입력하세요
# SUBSTR(문자열, 시작위치, 글자수)
# SUBSTR(product_code, 1, 2)

SELECT LEFT(product_code, 2) AS category, COUNT(*) AS products
FROM product
GROUP BY category
ORDER BY product_code;