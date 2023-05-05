-- 코드를 입력하세요
SELECT a.flavor
FROM first_half a JOIN july b ON a.flavor = b.flavor
GROUP BY flavor
ORDER BY a.total_order + SUM(b.total_order) DESC
LIMIT 3;