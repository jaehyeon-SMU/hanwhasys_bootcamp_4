-- autocommit 비활성화
SET autocommit = 0;

START TRANSACTION;

INSERT 
  INTO tbl_menu
VALUES
(
  NULL ,'바나나해장국', 8500
, 4, 'Y'
);
UPDATE tbl_menu
	SET menu_name = '수정된 메뉴1'
 WHERE menu_code = 5;
 
UPDATE tbl_menu
	SET menu_name = '수정된 메뉴2'
 WHERE menu_code = 6;
 
SELECT * FROM tbl_menu; -- 조회 된 데이터는 실제 DB에 적용된 값이 아니다.

ROLLBACK;   -- start transaction 으로 돌아간다. commit시 rollback이 될 수 없다.(따라서 autocommit을 0으로 만듦)

SELECT * FROM tbl_menu; -- rollback 또는 commit 이후 select 한 것이 실제 DB에 적용된 값이다.