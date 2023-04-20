-- 코드를 입력하세요
SELECT u.user_id, u.nickname, SUM(b.price) AS total_sales
FROM used_goods_board b JOIN used_goods_user u ON b.writer_id = u.user_id
WHERE b.status = 'DONE'
GROUP BY b.writer_id
HAVING SUM(price) >= 700000
ORDER BY 3;