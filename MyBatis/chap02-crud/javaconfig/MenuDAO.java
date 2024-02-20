package com.ohgiraffers.section02.javaconfig;


import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class MenuDAO {
    public List<com.ohgiraffers.section01.xmlconfig.MenuDTO> selectAllMenus(SqlSession sqlSession) {

        return sqlSession.selectList("MenuMapper.selectAllMenus");
    }

    public com.ohgiraffers.section01.xmlconfig.MenuDTO selectMenuByMenuCode(SqlSession sqlSession, int menuCode) {

        return sqlSession.selectOne("MenuMapper.selectMenu", menuCode);     // 단일행 조회기 때문에 selectOne 명시 해줘야함.
    }

    public int insertMenu(SqlSession sqlSession, com.ohgiraffers.section01.xmlconfig.MenuDTO menu) {

        return sqlSession.insert("MenuMapper.insertMenu", menu);
    }

    public int modifyMenu(SqlSession sqlSession, MenuDTO menu) {

        return sqlSession.update("MenuMapper.updateMenu", menu);
    }

    public int deleteMenu(SqlSession sqlSession, int menuCode) {

        return sqlSession.delete("MenuMapper.deleteMenu",menuCode);
    }
}