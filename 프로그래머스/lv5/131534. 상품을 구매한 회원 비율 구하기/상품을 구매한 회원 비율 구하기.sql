-- 코드를 입력하세요
SELECT YEAR(b.sales_date) AS YEAR, MONTH(b.sales_date) AS MONTH, 
       COUNT(DISTINCT b.user_id) AS PUCHASED_USERS, 
       ROUND(COUNT(DISTINCT b.user_id) / (SELECT COUNT(*) 
                                    FROM user_info 
                                    WHERE YEAR(joined) = '2021'), 1) AS PUCHASED_RATIO
FROM user_info a JOIN online_sale b ON a.user_id = b.user_id
WHERE DATE_FORMAT(a.joined, '%Y') = '2021'
GROUP BY year, month
ORDER BY year, month;