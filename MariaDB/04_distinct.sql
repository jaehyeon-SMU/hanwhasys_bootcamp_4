-- DISTINCT 
-- 중복된 값을 제거하는데 사용, 컬럼에 있는 컬럼값들의 종류를 쉽게 파악

SELECT
		category_code
	FROM tbl_menu
   ORDER BY category_code; 
   
   
SELECT
		DISTINCT category_code
	FROM tbl_menu
   ORDER BY category_code; 

-- distinct 사용 시에는 일반 컬럼을 사용할 수 없다.
-- distinct가 무의미 해지기 때문에

SELECT 
		DISTINCT category_code
--			, menu_name
	FROM tbl_menu;
	
-- null값을 포함한 컬럼의 distinct
SELECT
		DISTINCT ref_category_code
	FROM tbl_category;
	
--  null을 나중으로 보내는 정렬을 해보자
SELECT
		 DISTINCT ref_category_code
	FROM tbl_category
--  WHERE ref_category_code IS NOT null 
  ORDER BY ref_category_code DESC;
  
SELECT
		 DISTINCT ref_category_code AS 'rcc'
	FROM tbl_category
  ORDER BY -rcc DESC;

--  기본 정렬의 개념(순번이나 별칭을 사용하지 않고는 정렬할 수 없다.)
SELECT
		 DISTINCT ref_category_code
	FROM tbl_category
  ORDER BY DISTINCT ref_category_code DESC; --에러 발생

-- ------------------------------------------------------------------
-- 컬럼 2개 이상도 distinct로 묶을 수는 있지만 좋은 형태은 아니다.
--  컬럼 2개 이상부터는 이후 배울 group by절을 통해 중복 제거를 하자.
SELECT 
		 DISTINCT category_code, orderable_status -- 둘다 같을 때만 하나로 친다.
	FROM tbl_menu;
	
