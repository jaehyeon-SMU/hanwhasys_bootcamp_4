package com.ohgiraffers.section03.interfaceimplements;

public class Product implements InterProduct{       // implements = 구현한다. + 인터페이스는 다중구현(다중상속)이 가능하다.

    @Override
    public void nonStaticMethod() {
        System.out.println("InterProduct의 nonStaticMethod 오버라이딩 메소드 호출됨,,,");
    }

    @Override
    public void defaultMethod() {                   //오버라이딩 시에는 dafault 예약어 제거할 것
        System.out.println("Product 클래스에서 인터페이스로부터 물려받은 dafaultMethod 호출됨,,,");;
    }


}
