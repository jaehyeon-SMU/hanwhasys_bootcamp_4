package com.ohgiraffers.section01.insert;

import java.sql.Connection;

import static com.ohgiraffers.common.JDBCTemplate.*;

/* 설명. Service 계층은 Connection 객체 생성 및 소멸(close) 및 비즈니스 로직, 트랜잭션(commit, rollback)처리 */
public class MenuService {
    public void registMenu(Menu registMenu){

        Connection con = getConnection();

        MenuRepository repository = new MenuRepository();
        int result = repository.registMenu(con,registMenu);
        if(result > 0){
//            con.commit();     // try/catch 문으로 지저분해 지니 JDBCTEMPLATE에 static 메소드를 만들어보자
            commit(con);
        }   else{

        }

        close(con);
    }
}
