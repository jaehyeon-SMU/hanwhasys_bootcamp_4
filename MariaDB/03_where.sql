-- orderabel_status = 'N'인 행들 조회하기
-- 주문 불가능한 메뉴 조회(메뉴명, 메뉴 코드)
SELECT
		  menu_name
		, menu_price
		, orderable_status
	FROM tbl_menu
 WHERE orderable_status = 'N'; -- where절은 필터이다.
 
-- DESC를 통한 컬럼명 빠르게 확인
DESC tbl_menu;

-- ----------------------------------------------------------
-- '기타' 카테고리에 해당하지 않는 메뉴늘 조회하시오
-- 1) '기타' 카테고리의 번호 파악하기
SELECT * FROM tbl_category;
SELECT * FROM tbl_category WHERE category_name = '기타'; -- category_code가 '10번'임을 알아냄

-- 2) 해당 번호를 가지지 않는 메뉴 조회
SELECT * FROM tbl_menu;
SELECT * FROM tbl_menu WHERE category_code <> 10; 
SELECT * FROM tbl_menu WHERE category_code != 10;

-- ----------------------------------------------------------
-- 10,000원 이상의 메뉴 조회
SELECT * FROM tbl_menu WHERE menu_price >= 10000;

SELECT 
		*
	FROM tbl_menu
 WHERE menu_price < 10000;

-- 10,000원 미만의 메뉴 조회
SELECT * FROM tbl_menu WHERE menu_price < 10000;

-- 10,000원 이상 12,000원 이하 메뉴 조회
SELECT * FROM tbl_menu WHERE menu_price >= 10000 AND menu_price <= 12000;
SELECT * FROM tbl_menu WHERE menu_price >= 10000 && menu_price <= 12000;

-- 논리 연산자(= 참과 거짓의 연산)
-- 사랑스런 조카가 타고싶은 놀이기구는 7세 이상, 100cm 이상만 가능(AND, 둘 다 만족,이면서, 그리고, 동시에)
SELECT
			*
	FROM nephew
  WHERE age >= 7
 	 AND height >= 100;
 	 
-- --------------------------------------------------------------------------------------------------------
-- where 절에서 and 와 or 을 통한 결과 비교
SELECT 
		  menu_code
		, menu_name
		, menu_price
		, category_code
		, orderable_status
	FROM tbl_menu
  WHERE menu_price > 5000
    AND category_code = 10; 
     
SELECT 
		  menu_code
		, menu_name
		, menu_price
		, category_code
		, orderable_status
	FROM tbl_menu
  WHERE menu_price > 5000
     OR category_code = 10;
-- --------------------------------------
-- between 연산자 활용하기
-- between 연산자는 초과, 미만은 불가능
SELECT
		  menu_name
		, menu_price
		, category_code 
	FROM tbl_menu
  WHERE menu_price >= 10000
    AND menu_price <= 25000
  ORDER BY menu_price;
  
SELECT
		  menu_name
		, menu_price
		, category_code 
	FROM tbl_menu
  WHERE menu_price BETWEEN 10000 AND 25000
  ORDER BY menu_price;  
  
-- 반대의 범위로 테스트
SELECT
		  menu_name
		, menu_price
		, category_code 
	FROM tbl_menu
  WHERE menu_price NOT BETWEEN 10000 AND 25000
  ORDER BY menu_price;
  
SELECT
		*
	FROM tbl_menu
  WHERE menu_price > 10000 
     OR menu_price < 25000
  ORDER BY menu_price;
  
--  ---------------------------------------------------
-- 메뉴중에 '밥'이 들어간 메뉴 조회

SELECT 
		*
	FROM tbl_menu       
  where menu_name LIKE '%밥%';
  
-- '밥'이 들어가지 않는 메뉴는 like앞or 컬럼명 앞에 not을 붙이면 됨 

SELECT 
		*
	FROM tbl_menu       
  where  menu_name NOT LIKE '%밥%';
  
-- ------------------------------------------------------------
-- in연산자

-- or을 활용한 중식,커피,기타 카테고리의 메뉴 회

SELECT
		  *
	FROM tbl_menu
  WHERE category_code = 5
     OR category_code = 8
     OR category_code = 10;
     
-- in을 활용
SELECT
		*
	FROM tbl_menu
  WHERE category_code IN (5,8,10);

--  ------------------------------------------------------
-- is null 연산자 활용

SELECT * FROM tbl_category;

-- ref_category_code(상위 카테고리 번호)가 없는 카테고리 조회
SELECT 
		*
	FROM tbl_category
  WHERE ref_category_code IS NULL; -- 반대의 경우 is not null
  

      