-- 코드를 입력하세요
SELECT a.title, a.board_id, b.reply_id, b.writer_id, b.contents, DATE_FORMAT(b.created_date, "%Y-%m-%d") AS created_date
FROM (SELECT title, board_id FROM used_goods_board WHERE DATE_FORMAT(created_date, "%Y-%m") = "2022-10") a 
  JOIN used_goods_reply b 
    ON a.board_id = b.board_id
ORDER BY created_date, title;