SELECT
		  menu_code
		,menu_name
		,menu_price 
	FROM tbl_menu
 ORDER BY menu_price ASC; -- ascendig:오름차순(ASC), descending: 내림차순(DESC)

 -- 내림차순
 -- ORDER BY menu_price DESC
 
-- 컬럼의 순번을 활용한 정렬(실제 테이블의 순서가 아닌 조회 할 때의 컬럼 순서 기준) >> 밑에 1
select
 		 menu_price
 	   ,menu_name
 	FROM tbl_menu
ORDER BY 1 ASC;
 
-- 별칭을 활용한 정렬
SELECT
		 menu_code AS 'mc'
		,menu_price AS 'mp'
		,menu_name AS 'mn'
	FROM tbl_menu
 ORDER BY mp DESC; -- 별칭으로 정렬할 때는 별칭명에 single quatation(')을 붙이면 안된다.
 
-- 컬럼의 복수개로 정렬
SELECT
		 menu_price
		,menu_name
	FROM tbl_menu
 ORDER BY 1 DESC, 2 ASC; -- 숫자는 우선순위이다. 1 = menu_price, 2= menu_name// '가격'으로 내림차순후 같은 가격일 시, '메뉴이름'을 오름차순으로 조회
 
 -- -------------------------------------------------------------------------------------------------------------------------
 -- Field
 SELECT FIELD('a','b','z','a'); -- 첫번째 a는 찾고자하는 것, 나머지는 대상이다. 따라서 field는 찾고자 하는 대상이 몇번째에 있나를 반환해준다. 즉 3이 출력
 -- 2번째 이후 인자 중에 1번째 인자의 값이 위치하는 값이 나옴
 
 
 -- tabel에서 조회 시 field 활용
 SELECT 
 		  FIELD(orderable_status,'N','Y') -- 행마다 컬럼값으로 하나씩 치환 (orderabel_status) ex)-첫번째 행에서는 Y로 치환
 		, orderable_status
 		, menu_name
 		, menu_code
 	FROM tbl_menu;
 
 -- field를 활용한 order by
 SELECT 
 		 menu_name
 		, orderable_status
 	FROM tbl_menu
 ORDER BY FIELD(orderable_status, 'N', 'Y') DESC;


--  -------------------------------------------------------------------------------------------
-- null 값에 대한 정렬
-- 1)오름차순 시: NULL값이 먼저 나옴
SELECT 
		*
	FROM tbl_category
 ORDER BY ref_category_code ASC; 
 
 -- 2)내림차순 시: Null값이 제일 나중에 나옴
 SELECT 
		*
	FROM tbl_category
 ORDER BY ref_category_code DESC;
 
 -- 3)오름차순에 -를 붙였을 때 >> NULL이 나중에 나오도록 바꿈
 SELECT 
 		*
 	FROM tbl_category
 ORDER BY -ref_category_code DESC; -- DESC를 통해 NULL을 나중에 보냄 - > -로 NULL이 아닌 값을 ASC로 바꿈
 
  -- 4)내림차순에 -를 붙였을 때 >> NULL이 처음에 나오도록 바꿈
 SELECT 
 		*
 	FROM tbl_category
 ORDER BY -ref_category_code ASC; -- ASC를 통해 NULL을 처음으로 보냄 >> -로 NULL이 아닌 값을 DESC로 바꿈