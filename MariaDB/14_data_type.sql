-- 명시적 형변환
SELECT AVG(menu_price) FROM tbl_menu; -- 그룹을 묶지않으면 모두를 하나로 본다.

-- 1) 숫자 - > 숫자
--  소수점에서 반올림해 정수까지 변환
SELECT CAST(AVG(menu_price) AS UNSIGNED INTEGER) AS '가격평균' FROM tbl_menu;

-- 소수점 이하 한자리까지 변환
select CAST(AVG(menu_price) AS FLOAT) AS '가격평균' FROM tbl_menu; -- 소수점 이하 한자리까지 출력

-- 소수점 이하 12자리까지 변환
SELECT CAST(AVG(menu_price) AS DOUBLE) AS '가격평균' FROM tbl_menu;

-- 2) 문자 ->  날짜
--2023년 12월 27일을 DATE형으로   변환
SELECT CAST('2033%12&27' as DATE);
SELECT CONVERT('2033/12/27',DATE);
SELECT CONVERT('2033-12-27',DATE);
SELECT CONVERT('2033#12#27',DATE);

-- 3)숫자 -> 문자
SELECT CONCAT(CAST(1000 AS CHAR), '원');

-- 암시적 형변환
-- 연산자 사용 시 자동 형변환이 되는데 주의해야 한다.
SELECT 1 + '2'; -- '2'가 숫자 2로 변환
SELECT CONCAT('1' , '2'); -- 모든 문자는 산술연산 또는 비교 연산을 만나면 0이 된다.

SELECT '안녕' + '하세요'; -- 모든 문자는 산술연산 또는 비교 연산을 만나면 0이 된다.
SELECT 5 > '반가워'; -- true의 의미인 1이 반환된다. 
