package com.ohgiraffers.section01.user_type;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) {

        /* 수업목표. 클래스가 무엇인지 이해하고 작성할 수 있다. */
        /* 설명.
        *   회원 정보를 관리하기 위해 회원의 여러 정보(아이디, 비밀번호, 이름, 나이
        *   성별,취미)를 취긓바여 관리 하려고 한다.
        *   이 자료를 취급할 수 있는 방법을 생각해 보자.
        * */

        /* 목차. 1. 변수를 이용한 회원 데이터 관리 */
        String id = "user01";
        String pwd = "pass01";
        String name = "홍길동";
        int age = 20;
        char gender = '남';
        String[] hobby = new String[]{"축구","볼링","테니스"};

        System.out.println("id = " + id);
        System.out.println("pwd = " + pwd);
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("hobby = " + Arrays.toString(hobby));

        /* 필기.
        *   이렇게 변수들로만 관리할 때 발생할 수 있는 문제점
        *   1. 많은 변수명들을 관리하기 힘들 수 있다.
        *   2. 메소드의 전달인자로 전달 할 값이 너무많아 회원과 관련된 기능을 호출할때 매개변수가 많아진다.
        *   3. 메소드의 반환형으로 회원이라는 개념을 반환할 수 없다.(메소드의 반환형은 하나여야 한다.)
        * */

        Member member = new Member();
        Member member2 = new Member();

        System.out.println(member.name);
        System.out.println(member2.name);

        member.name = "김철수";
        member2.name = "김영희";

        System.out.println(member.name);
        System.out.println(member2.name);

        /* 설명. 김철수씨만 완성해보자. */
        member.age = 30;
        member.gender = '남';
        member.hobby = new String[]{"볼링","하키"};
        member.id = "user03";
        member.pwd = "pwd03";

        /* 설명. 회원 정보를 하나의 전달인자로 전달하고 하나의 매개변수로 받을 수 있다. */
        /* 설명. 또한 메소드의 반환형으로 한번에 회원 정보를 반환할 수 있고, 반환 받은곳에서 반환된 객체 에 접근도 가능하다. */
        System.out.println(printMember(member).name);

        Member renameMember = printMember(member);
        System.out.println(renameMember.age);
        System.out.println(Arrays.toString(renameMember.hobby));


    }

    private static Member printMember(Member member){
        System.out.println("개명을 시작합니다.");
        member.name = "박길동";

        return member;
    }
}
