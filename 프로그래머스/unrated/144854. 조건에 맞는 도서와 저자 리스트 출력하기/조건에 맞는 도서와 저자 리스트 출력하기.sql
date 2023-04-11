-- 코드를 입력하세요
SELECT b.book_id, a.author_name, DATE_FORMAT(b.published_date, '%Y-%m-%d') published_date
FROM book b JOIN author a ON b.author_id = a.author_id
WHERE category = '경제'
ORDER BY published_date;