package com.ohgiraffers.section04.overflow;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. 오버플로우에 대해 이해할 수 있다. */
        /* 필기.
        *   자료형 별 값의 최대 범위를 벗어나는 경우
        *   발생한 carry를 버림처리 하고 sign bit를 반전시켜 최소값으로 순환시킴
        * */

        /* 목차. 1. 오버플로우 */
        byte num1 = 127;            // byte 자료형의 양의 최대 저장 범위 값

        System.out.println("num1 = " + num1);

        // num1 = num1 +1;          컴파일 에러 발생
        num1++;                    // num1 = num1 + 1과 의미상 같다.
        System.out.println("num1 = " + num1);

        num1++;
        System.out.println("num1 = " + num1);

        num1++;
        System.out.println("num1 = " + num1);

        /* 목차. 2. 언더플로우 */
        byte num2 = -127;           // byte의 최소 저장 범위

        num2--;                     // num2 = num2 -1과 의미상 같다.
        System.out.println("num2 = " + num2);

        num2--;
        System.out.println("num2 = " + num2);

        num2--;
        System.out.println("num2 = " + num2);


        /* 설명.
        *   일반적으로 많이 사용한는 int 형의 최대값은 대략 21억 정도이다.
        *   이 범위를 벗어난 계산은 오버플로우를 발생시켜 원하지 않는 결과값이 나오게 될 수 있다.
        * */
        int firstNum = 1000000;
        int secondNum = 700000;

        int multi = firstNum * secondNum;

        System.out.println("firstNum * secondNum= " + multi);
    }
}
