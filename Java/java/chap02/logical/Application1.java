package com.ohgiraffers.section05.logical;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. 논리연산자에 대해 이해하고 활용할 수 있다. */
        /* 필기.
        *   논리 연산자
        *   논리값(true or false)를 취급하는 연산자이다.
        *
        *   필기.
        *    논리 연산자의 종류
        *    1. 논리 연결 연산자: 두 개의 피연산자를 가지는 이항 연산자이며, 연산자의 결합 방향은 왼쪽에서 오른쪽이다.
        *                      두 개의 논리식을 판단하여 참과 거짓을 판단한다.
        *      1-1. &&(논리 AND) 연산자: 두 개의 논리식 모두 참일 경우 참을 반환, 둘 중 하나라도 거짓인 경우 거짓을 반환하는 연산자
        *      1-2. ||(논리 OR) 연산자: 두 개의 논리식 중 둘 중 하나라도 참일 경우 참을 반환, 둘 다 모두 거짓인 경우 거짓을 반환하는 연산자
        *    2. 논리 부정 연산자: 피연산자가 하나인 단항 연산자로, 피 연산자의 결합 방향은 왼쪽에서 오른쪽이다.
        *      2-1. !(논리 NOT) 연산자: 논리식의 결과가 참이면 거짓을 , 거짓이면 참을 반환한다.
        * */

        /* 목차. 1. 논리 연산자 결과값 확인 */
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println(!true);
        System.out.println(!false);
        System.out.println("======================================================");

        /* 목차. 2. 논리식에 논리연산자 결과값 확인 */
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int num4 = 40;

        System.out.println(num1 < num2 && num3 < num4);
        System.out.println(num1 < num2 && num3 > num4);
        System.out.println(num1 > num2 && num3 < num4);
        System.out.println(num1 > num2 && num3 > num4);
        System.out.println("=======================================================");

        System.out.println(num1 < num2 || num3 < num4);
        System.out.println(num1 < num2 || num3 > num4);
        System.out.println(num1 > num2 || num3 < num4);
        System.out.println(num1 > num2 || num3 > num4);

        //필기. 단산시 교비논 삼대(단항 산술 시프트 비교 비트 논리 삼항 대행)

    }
}
