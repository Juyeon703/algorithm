-- 코드를 입력하세요
SELECT i.name, i.datetime
FROM animal_ins i
  LEFT OUTER JOIN animal_outs o
  ON i.animal_id = o.animal_id
WHERE o.animal_id IS NULL
ORDER BY i.datetime
LIMIT 3;