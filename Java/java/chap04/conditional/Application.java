package com.ohgiraffers.section01.conditional;

/* 설명. 이제부터 실행용 클래스를 구분해서 사용한다. (main 메소드는 여기에만 포함) */
public class Application {

    public static void main(String[] args) {

        A_if aClass = new A_if();
        /* 필기. 단독 IF문 흐름 확인용 메소드 호출 */
        //aClass.testSimpleIfStatement();

        /* 필기. 중첩 IF문 흐름 확인용 메소드 호출 */
        //aClass.testNestedIfStatement();

        B_ifElse b = new B_ifElse();

        /* 필기. 단독 if_else문 흐름 확인용 메소드 호출 */
        //b.testSimpleIfElseStatement();

        /* 필기. 중첩 if-else문 흐름 확인용 메소드 호출 */
        //b.testNestedIfElseStatement();

        C_ifElseIf cClass = new C_ifElseIf();

        /* 필기. 단독 if-else-if문 흐름 확인용 메소드 호출 */
        //cClass.testSimpleIfElseIfStatement();
        /* 필기. 중첩 if-else-if문 흐름 확인용 메소드 호출 */
        cClass.testNestedIfElseIfStatement();
        /* 필기. 중첩 if-else-if문 로직 개선 */
    }
}