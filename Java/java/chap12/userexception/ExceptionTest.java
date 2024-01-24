package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMonetException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class ExceptionTest {
    public void checkEnoughMoney(int price, int money) throws PriceNegativeException, MoneyNegativeException, NotEnoughMonetException {

        /* 설명. throw를 통한 예외 발생시 바로 메소드를 호출한 곳으로 예외 인스턴스와 함께 반환된다. */
        if(price < 0) {
            throw new PriceNegativeException("상품 가격은 음수일 수 없습니다.");
        }

        if(money < 0){
            throw new MoneyNegativeException("돈도 없으면서 뭘 사려고 그러십니까");
        }

        if(money < price){
            throw new NotEnoughMonetException("가진 돈 보다 상품 가격이 더 비쌉니다.");
        }

        System.out.println("가진 돈이 충분하시군요 고객님! 즐거운 쇼핑 되세요!");
    }
}