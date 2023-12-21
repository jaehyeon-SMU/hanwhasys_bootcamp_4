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