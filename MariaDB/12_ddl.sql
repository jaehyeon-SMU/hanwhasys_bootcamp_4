CREATE TABLE IF NOT EXISTS tb1 (  -- 에러를 피할 수 있다. IF NOT EXISTS는 옵션.
    pk INT PRIMARY KEY,				 -- 컬럼 레벨에서 제약조건 추가(PRIMARY KEY >> unique, not null)
    fk INT,								 -- pk, fk, col1은 컬럼명이다.
    col1 VARCHAR(255),				 -- 들어간 데이터에 맞춰서 용량을 줄인다.(가변) - Varchar을 쓰는 이유
    CHECK(col1 IN ('Y', 'N'))		 -- 테이블 레벨에서 제약조건 추가
) ENGINE=INNODB;
-- (한글은 1글자당 3byte)

DESCRIBE tb1;
-- 줄여서 쓸 수 있다.
DESC tb1;

INSERT
  INTO tb1
VALUES
(
  1,2,'Y'
);


-- ----------------------------------------------------------
CREATE TABLE IF NOT EXISTS tb2 (  
    pk INT PRIMARY KEY AUTO_INCREMENT ,				 
    fk INT,								 
    col1 VARCHAR(255),				 
    CHECK(col1 IN ('Y', 'N'))		
) ENGINE=INNODB;

DESC tb2;

INSERT
  INTO tb2
VALUES
(
  NULL ,2,'Y'
);

SELECT * FROM tb2;


-- ------------------------------
-- ALTER (사실 alter을 쓰는건 잘못된것, 기존에 데이터가 있다면 tabel을 다시 만들어야 한다.)
-- 컬럼 추가
ALTER TABLE tb2 ADD col2 INT NOT NULL;

DESC tb2;

-- 컬럼 삭제
ALTER TABLE tb2 DROP COLUMN col2;

DESC tb2;

-- 컬럼 이름 및 컬럼 정의 변경
ALTER TABLE tb2 
CHANGE COLUMN fk change_fk INT NOT NULL;

DESC tb2;

-- 제약조건 제거(auto_increment로 인해 제거 불가)
ALTER TABLE tb2 DROP PRIMARY KEY; -- auto increment를 달기 위해서는 primary key가 필요하므로 primary key만 지울 수 없다.

-- auto_increment 제거
ALTER TABLE tb2 MODIFY pk INT;
DESC tb2;

-- 다시 primary key 제거
ALTER TABLE tb2 DROP PRIMARY KEY;


-- Truncate (delete보다 더 빠르게 삭제가 가능하다. 완벽한 초기화)
CREATE TABLE if NOT EXISTS tb6(
  pk INT AUTO_INCREMENT PRIMARY KEY,
  fk INT,
  col1 VARCHAR(255),
  CHECK(col1 IN('Y','N'))
) ENGINE = INNODB;

INSERT 
  INTO tb6 
VALUES 
(NULL,10,'Y')
,(NULL,20,'Y')
,(NULL,30,'Y')
,(NULL,40,'Y');

SELECT * FROM tb6;

TRUNCATE tb6;