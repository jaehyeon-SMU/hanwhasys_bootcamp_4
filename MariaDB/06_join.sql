SELECT 
	FROM tbl_menu
	JOIN tbl_category ON tbl_menu.category_code = tbl_category.category_code;

-- --------------------------------------------------------------------------
SELECT
		 *
	FROM tbl_menu;
	
SELECT
		 *
	FROM tbl_category;
	
--  메뉴 명과 카테고리명만 조회
SELECT 
		  menu_name
		, category_name
	FROM tbl_menu
	JOIN tbl_category ON (tbl_menu.category_code = tbl_category.category_code);
	
-- 테이블명도 별칭(alias)을 붙일 수 있다.
SELECT 
		  menu_name
		, category_name
	FROM tbl_menu AS a
	JOIN tbl_category AS b ON (a.category_code = b.category_code);
	
-- 두 테이블에 같은 컬럼명이 있는 상태에서 조인시 주의할점
SELECT 
		  menu_name
		, category_name
	FROM tbl_menu a
	JOIN tbl_category b ON (category_code = category_code); -- clause IS ambiguous(애매모호하다고 에러 발생)
	-- 두 테이블이 동일한 컬럼일 시 별칭 필수

SELECT 
		  menu_name
		, category_name
		, a.category_code -- select절도 동일한 컬럼은 별칭을 필수로 달아야 한다.
	FROM tbl_menu a
	JOIN tbl_category b ON (a.category_code = b.category_code);

-- 관례상 join시에는 쿼리에 사용되는 모든 컬럼에 별칭을 다는 것을 원칙으로 한다.
SELECT 
		  a.menu_name
		, b.category_name
		, a.category_code
	FROM tbl_menu a -- tabel별칭은 보통 AS를 잘 안붙인다.
	JOIN tbl_category b ON (a.category_code = b.category_code)
  WHERE b.category_code = 8; 
  
-- -----------------------------------------------------------
-- 1)inner join: on 또는 using 뒤에 오는 join의 조건을 만족하여 매칭되는 결과들만  join됨
SELECT
		 *
	FROM tbl_menu a
	JOIN tbl_category b ON (a.category_code = b.category_code)
  WHERE b.category_code = 7;  -- 조회 결과 없음(7번 카테고리는 존재하지만 join에서는 존재x)
  
-- 2) Left join: join 키워드 기준 왼쪽 테이블의 행이 모두 나오도록 join

UPDATE tbl_menu
	SET category_code = NULL 
 WHERE menu_code = 1;
 
DESC tbl_menu; 

-- 3) right join: join 키워드 기준 오른쪽 테이블이 행이 모두 나오도록 join
SELECT 
		 *
	FROM tbl_menu a
   JOIN tbl_category b USING (category_code);

SELECT 
		 *
	FROM tbl_menu a
 RIGHT JOIN tbl_category b USING (category_code);
-- 4) cross join

-- 5) self join