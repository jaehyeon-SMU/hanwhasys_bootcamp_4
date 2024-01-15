package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class B_nestedFor {
    public void printGugudanFromTwoToNine() {

        /* 수업목표. 중첩된 for문의 흐름을 이해하고 적용할 수 있다. */

        /* 설명.
        *   2단
        *   2 * 1 = 2
        *   2 * 2 = 4
        *   2 * 3 = 6
        *   2 * 4 = 8
        *   ...
        *   9 * 9 = 81
        * */

        for(int i = 2; i <= 9; i++){        // 단수:2~9
            System.out.println("=====================================");
            for(int j = 1; j <= 9; j++){    // 곱해지는 수:1~9
                System.out.println(i +"*" + j + "=" + (i * j));
            }
        }
    }

    public void printUpgradeGugudanFromTwoToNine() {

        /* 수업목표. inner for문을 메소드로 따로 모듈화 해보자.(하나의 기능 단위로 보고) */
        for(int dan = 2; dan < 10; dan++){
            System.out.println(dan + "단 출력");
            printGugudanOf(dan);
            System.out.println();
        }
    }

    /* 설명. 단수를 넘기면 1~9까지 곱해서 숫자를 출력해주는 기능 */
    private void printGugudanOf(int dan) {
        for(int su = 1; su < 10; su++){
            System.out.println(dan + "*" + su + " = " + (dan * su));
        }
    }

    /* 설명.
    아래와 같이 나오게 작성
    정수를 입력하시오: 5
    *     *
    *    **
    *   ***
    *  ****
    * *****
    * */
    public void printStars() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i = 1; i < num+1; i++){
            for(int j = num; j > i; j--){
                System.out.print(" ");
            }
            for(int k = 0; k < i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
