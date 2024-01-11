package com.ohgiraffers.section01.method;

public class Application2 {
    public static void main(String[] args) {
        System.out.println("main() 시작됨...");
        methodA();
        methodB();
        methodC();
        System.out.println("main() 종료됨...");
    }
    public static void methodA() {
        System.out.println("methodA() 호출됨..");
        System.out.println("methodA() 종료됨..");
    }

    public static void methodB(){
        System.out.println("mehtodB() 호출됨..");
        System.out.println("mehtodB() 종료됨..");
    }

    public static void methodC(){
        System.out.println("mehtodC() 호출됨..");
        System.out.println("mehtodC() 종료됨..");
    }
}
