-- 코드를 입력하세요
SELECT a.member_name, b.review_text, DATE_FORMAT(b.review_date, '%Y-%m-%d') AS review_date
FROM member_profile a JOIN rest_review b ON a.member_id = b.member_id
WHERE b.member_id IN (SELECT member_id
                      FROM rest_review 
                      GROUP BY member_id
                      HAVING count(*) = (SELECT MAX(res_count) 
                                         FROM (SELECT COUNT(*) as res_count 
                                               FROM rest_review 
                                               GROUP BY member_id) as result))
ORDER BY review_date, review_text;