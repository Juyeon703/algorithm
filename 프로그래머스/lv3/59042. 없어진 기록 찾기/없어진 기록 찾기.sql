-- 코드를 입력하세요
SELECT o.animal_id, o.name
FROM animal_ins i
  RIGHT JOIN animal_outs o
  ON i.animal_id = o.animal_id
WHERE i.animal_id IS NULL;