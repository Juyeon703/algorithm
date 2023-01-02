-- 코드를 입력하세요
SELECT a.flavor
FROM first_half as a
join icecream_info b
on a.flavor = b.flavor
where total_order > 3000 AND ingredient_type = 'fruit_based'
ORDER BY total_order desc;