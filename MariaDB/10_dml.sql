INSERT 
  INTO tbl_menu
(
  menu_code
, menu_name
, menu_price
, category_code
, orderable_status
)
VALUES
(
  NULL
, '코코넛해장국'
, 8500
, 4
, 'Y'
);
-- 정확하게 컬럼의 숫자와 순서가 동일해야 한다.
-- values위에 컬럼을 명시하면 적은 순서로 넣을 수 있다.

SELECT * FROM tbl_menu ORDER BY 1 DESC;
-- UPDATE

UPDATE tbl_menu
   SET category_code = 7
 WHERE menu_code = 24; -- where절이 없다면 모든 행이 7로 바뀐다.

UPDATE tbl_menu
   SET menu_name = '딸기맛탕'
 WHERE menu_code = 21;
 
-- -------------------------------------
INSERT 
	INTO tbl_menu
(
  menu_code, menu_name,menu_price
, category_code, orderable_status
)
VALUES
(
 17, '아샷추매운탕',9000 -- 기존에 이미 17이 있기때문에 에러발생 ,따라서 replace가 필요
, 4, 'N'
);
 
REPLACE 
	INTO tbl_menu
(
  menu_code, menu_name,menu_price
, category_code, orderable_status
)
VALUES
(
 17, '아샷추매운탕',9000 -- 기존에 이미 17이 있기때문에 에러발생 ,따라서 replace가 필요
, 4, 'N'
);
 
