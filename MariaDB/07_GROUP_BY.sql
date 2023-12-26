SELECT
		  category_code
	FROM tbl_menu
  WHERE category_code IS NOT null 
  GROUP BY category_code;
  
  SELECT
		  category_code		-- 그룹을 묶은 컬럼을 제외한,그룹 함수만 가능
		, COUNT(*)					--  모든 행 갯수 세기
		, COUNT(menu_price)		-- 컬럼에 있는 값중 null값이 아닌 것들만 count 
		, SUM(menu_price)
		, AVG(menu_price)
	FROM tbl_menu
  WHERE category_code IS NOT null 
  GROUP BY category_code;		-- GROUP BY 한 컬럼제외 다른 컬럼이 들어가면 안된다.
  
  
	SELECT									-- 4
		  category_code		
		, COUNT(*)			
		, SUM(menu_price)
		, AVG(menu_price)
	FROM tbl_menu							-- 1
  WHERE category_code IS NOT NULL 	-- 2
  GROUP BY category_code				-- 3
  ORDER BY 2;								-- 5
  

-- 조회의 6가지 절을 모두 활용한 예제
-- SELECT: GROUP BY 절에서 GROUP을 묶는 조건으로 활용한 컬럼만 조회
--				또는 그룹 함수를 통해 조회한다.

-- FROM: 테이블 또는 JOIN을 활용한 result set을 작성한다.

-- WHERE: FROM절의 각 행마다 적용될 조건을 작성한다.

-- GROUP BY: WHERE절까지 만족하는 행들에 대해 그룹이 될 컬럼을 작성한다.

-- HAVING: 그룹별로 적용할 조건을 GROUP BY에서 작성한 컬럼
--				또는 그룹 함수를 통해 조회한다.

-- ORDER BY: 제일 마지막에 해석되며 SELECT의 결과(result set)의 순번, 별칭,컬럼ㅁ명
--				 등으로 오름차순 또는 내림차순 한다.


SELECT										-- 5
		  category_code		
		, COUNT(*)			
		, SUM(menu_price)
		, AVG(menu_price)
	FROM tbl_menu								-- 1
  WHERE category_code IS NOT NULL 		-- 2
  GROUP BY category_code					-- 3
 HAVING SUM(menu_price) >= 24000			-- 4
  ORDER BY 3;									-- 6
  
  
-- ------------------------------------------------------------
-- 메뉴가 없는 카테고리까지 셀껀지 구분해서 COUNT 해보기
SELECT
		  COUNT(*)
		, COUNT(a.menu_name)
	FROM tbl_menu a
  RIGHT JOIN tbl_category b ON (a.category_code = b.category_code); 
-- right join을 하지 않으면 null은 카테고리에서 제외된다.

--  -----------------------------------------------------------
-- 함수의 종류
-- 단일행 함수: NVL 또는 IFNULL과 같이 단일 행마다 적용되어 행의 갯수만큼 결과가 나오는 경우 
-- 그룹 함수: COUNT, SUM, AVG와 같이 그룹마다 적용되어 그룹의 갯수만큼 결과가 나오는 경우 
-- 				(단, GROUP BY절이 없는 조회는 그룹 함수의 결과가 단일행이다.)


