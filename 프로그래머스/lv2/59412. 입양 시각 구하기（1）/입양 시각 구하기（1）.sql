-- 코드를 입력하세요
SELECT HOUR(datetime), COUNT(*) as count
FROM animal_outs
WHERE HOUR(datetime) BETWEEN 9 and 19
GROUP BY HOUR(datetime)
ORDER BY HOUR(datetime);