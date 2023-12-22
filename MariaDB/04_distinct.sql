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
  ORDER BY 1 DESC;
  
SELECT
		 DISTINCT ref_category_code AS 'rcc'
	FROM tbl_category
  ORDER BY -rcc DESC;
