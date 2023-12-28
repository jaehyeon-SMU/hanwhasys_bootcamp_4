-- 1. 문자열 관련 함수

-- ascii(아스키 코드), char(숫자)
SELECT ASCII('a'), CHAR(97);

-- bit_length(문자열), char_length(문자열), length(문자열)
-- 영어, 숫자,특수기호 제외 한 문자당 3바이트 할당
SELECT 
		  BIT_LENGTH('한글')
		, CHAR_LENGTH('한글')
		, LENGTH('한글');
		
-- concat(문자열1, 문자열2, ...) concat_ws(구분자, 문자열1,문자열2)
SELECT CONCAT('nice',' to' ,' meet' ,' you!');
SELECT CONCAT_WS(' ', 'nice', 'to', 'meet', 'you!');
SELECT CONCAT(CAST(menu_price AS CHAR) , '원')FROM tbl_menu;

-- ELT(위치, 문자열1, 문자열2, ...), FIELD(찾을 문자열, 문자열1,문자열2,...),
-- FIND_IN_SET(찾을 문자열, 문자열 리스트), INSTR(기준 문자열, 부분 문자열),
-- LOCATE(부분 문자열, 기준 문자열)
SELECT 
         ELT(2, '축구', '야구','농구')
		 , FIELD('축구','야구','농구','축구')
		 , FIND_IN_SET( '축구','야구,농구,축구')
		 , INSTR('축구농구야구', '농구')
		 , LOCATE('야구', '축구농구야구');    -- INSTR과 LOCATE는 서로 인자가 반대
		 
-- INSERT(기준 문자열, 위치, 해당위치에서 지울 길이, 삽입할 문자열)
SELECT INSERT('나와라피카츄!',3,1,'또가스꼬부기');

-- LEFT(문자열, 길이), RIGHT(문자열, 길이)
SELECT LEFT('Hello World!',5), RIGHT('Nice shot!', 5);

-- UPPER(문자열), LOWER(문자열)
SELECT LOWER('Hello World!'), UPPER('Hello World!');

-- LPAD(문자열, 길이, 채울 문자열), RPAD(문자열,길이,채울 문자열)
SELECT LPAD('왼쪽',10,'#'), RPAD('오른쪽', 10, '#');

-- LTRIM(문자열), RTRIM(문자열) -- 공백 제거
-- TRIM(문자열), TRIM(방향 자를_ 문자열 from 문자열)
SELECT LTRIM('        왼쪽'), RTRIM('오른쪽         ');
SELECT 
		  TRIM('                      MariaDB               ')
		, TRIM(BOTH '@' FROM '@@@@MariaDB@@@@')
		, TRIM(LEADING '@' FROM '@@@@MariaDB@@@@') -- LTRIM
		, TRIM(TRAILING '@' FROM '@@@@MariaDB@@@@'); -- RTRIM
		
		
SELECT CONCAT(menu_name, '의 가격은', menu_price, '입니다.') FROM tbl_menu;

-- FORMAT(숫자, 소수점 자릿수)
SELECT FORMAT(12312313213, 3);

-- BIN(숫자), OCT(숫자), HEX(숫자)
SELECT BIN(65), OCT(65), HEX(65);

-- REPEAT(문자열, 횟수)
SELECT REPEAT('오져따리 ',5);

-- REPLACE(문자열, 찾을 문자열, 바꿀 문자열)
SELECT REPLACE('마리아DB', '마리아', 'Maria');

-- REVERSE(문자열)
SELECT REVERSE('HAPPINESS');

-- SPACE(길이)
SELECT CONCAT('제 포켓몬은', SPACE(3) , '이고, 속성은', SPACE(6), '입니다.');

-- ★SUBSTRING(문자열, 시작위치, 길이)
SELECT SUBSTRING('열심히 DB공부를 해 봐요!', 5 , 4);
SELECT SUBSTRING('열심히 DB공부를 해!', 9); -- 9번째 문자부터 끝까지

-- SUBSTRING_INDEX(문자열, 구분자, 횟수)
SELECT
		  SUBSTRING_INDEX('010-1234-5678', '-', 2)
		, SUBSTRING_INDEX('010-1234-5678', '-', -1);


-- 2. 숫자 관련 함수
-- ABS(숫자) 절댓값
SELECT ABS(-123);

-- CEILING(숫자)올림, FLOOR(숫자)버림, ROUND(숫자)반올림
SELECT CEILING(1234.56), FLOOR(1234.56), ROUND(1234.56);

-- CONV(숫자, 원래 진수, 변환할 진수)
SELECT CONV('A', 16,10) ,  CONV('A',16,2);

-- MOD(숫자1, 숫자2) 나머지
SELECT MOD(10 , 3);

-- POW(숫자1, 숫자2) 제곱, SQRT(숫자) 루트
SELECT POW(3,2), SQRT(81);

-- RAND()
-- RAND() * 생성할 난수 갯수 + 난수의 초기값
-- EX) 5~33 난수 생성일 경우 RAND()*29(33 - 5 +1) +5 
SELECT FLOOR(RAND() * 4 +5);

-- sign(숫자)
SELECT SIGN(10.1), SIGN(0), SIGN(-1,1);

-- TRUNCATE(숫자,정수)
SELECT TRUNCATE(12345.12345,2), TRUNCATE(12345.12345, -2);


-- 3. 날짜 및 시간 관련 함수
-- ADDDATE(날짜, 차이), SUBDATE(날짜, 차이)
SELECT ADDDATE('2020-02-01', INTERVAL 28 DAY), ADDDATE('2020-02-01', 28);
SELECT SUBDATE('2020-02-01', INTERVAL 1 DAY), SUBDATE('2020-02-01', 1);

SELECT ADDDATE('2020-02-01', INTERVAL 28 MONTH);
SELECT SUBDATE('2020-02-01', INTERVAL 1 MONTH);

-- ADDTIME(날짜/시간, 시간), SUBTIME(날짜/시간, 시간)
SELECT ADDTIME('2023-12-28 10:27:00', '1:0:10');
SELECT SUBTIME('2023-12-28 10:27:00', '1:0:10');

-- CURDATE() , CURTIME(), NOW(), SYSDATE()
SELECT CURDATE(), CURTIME(), NOW(), SYSDATE();

SELECT CURTIME(), CURRENT_TIME(), CURRENT_TIME;

-- YEAR(날짜), MONTH(날짜), DAY(날짜)
-- DATE(날짜/시간), TIME(날짜/시간)
SELECT YEAR(CURDATE()), MONTH(CURDATE()), DAY(CURDATE()), DAY(CAST('2023-12-28' AS DATE));
SELECT HOUR(CURTIME()), MINUTE(CURTIME()), SECOND(CURTIME());

SELECT DATE(NOW()), TIME(NOW());

-- DATEDIFF(날짜1, 날짜2), TIMEDIFF(날짜1 또는 시간1, 날짜2 또는 시간2)
SELECT DATEDIFF('2024-06-14','2023-12-28'), TIMEDIFF('18:00:00',CURTIME());

-- DAYOFWEEK(날짜), MONTHNAME(날짜) DAYOFYEAR(날짜)
SELECT DAYOFWEEK(CURDATE()), MONTHNAME(CURDATE()), DAYOFYEAR(CURDATE());

-- LAST_DAY(날짜)
SELECT LAST_DAY('20230201');

-- MAKEDATE(연도, 지난 날)
SELECT MAKEDATE(2023, 35);

-- MAKETIME(시간, 분, 초)
SELECT MAKETIME(17,50,01);

-- QUARTER(날짜)
SELECT QUARTER('2023-12-28');

--TIME_TO_SEC(시간)
SELECT TIME_TO_SEC(CURTIME());