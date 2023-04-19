-- 코드를 입력하세요
SELECT a.category, SUM(b.sales) AS total_sales
FROM book a JOIN book_sales b ON a.book_id = b.book_id
WHERE DATE_FORMAT(b.sales_date, '%Y-%m') = '2022-01'
GROUP BY category
ORDER BY category;