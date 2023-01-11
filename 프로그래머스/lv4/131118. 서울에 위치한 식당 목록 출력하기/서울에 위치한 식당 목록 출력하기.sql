-- 코드를 입력하세요
SELECT a.rest_id, a.rest_name, a.food_type, a.favorites, a.address, ROUND(AVG(b.review_score), 2) as average
FROM rest_info a
JOIN rest_review b ON a.rest_id = b.rest_id
WHERE address LIKE '서울%'
GROUP BY rest_id
ORDER BY average DESC, favorites DESC;