package com.ohgiraffers.section01.method;

public class Application8 {
    public static void main(String[] args) {

        /* 수업목표. static 메소드를 호출할 수 있다. */
        // System.out.println("10과 20의 합: " + Application8.sumTwoNumber(10,20));
        System.out.println("10 과 20의 합: " + sumTwoNumber(10,20));           // 필기. 호출하는 static 메소드가 같은 클래스에
                                                                                // 필기. 존재하면 '클래스명'을 생략할 수 있다.
    }

    private static int sumTwoNumber(int first, int second) {
        return first + second;
    }
}
