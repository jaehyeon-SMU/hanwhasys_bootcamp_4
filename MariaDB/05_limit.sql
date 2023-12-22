-- Limit 
-- select문의 결과 집합에서 반환할 행의 수를 제한하는데 사옹 (다중행)

SELECT * FROM tbl_menu;

SELECT
		*
	FROM tbl_menu
 LIMIT 0,5; -- 0번 인덱스 부터 5개를 가져와라
 
 SELECT 
 		*
 	FROM tbl_menu
 LIMIT 5,5;
 
SELECT
		*
	FROM tbl_menu
	ORDER BY menu_price DESC , menu_name ASC 
	LIMIT 5; -- limit(0,5)
	
-- limit을 자주 쓰진 않지만 이후 Top-N분석이나 paging 처리를 할 때 사용된다.