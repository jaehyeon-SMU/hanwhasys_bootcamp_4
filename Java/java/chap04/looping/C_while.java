package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class C_while {

    public void testSimpleWhileStatement() {

        /* 수업목표. while문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */
        int i = 1;
        while(i <= 10){
            System.out.println("i = " + i);
            i++;
        }
    }

    public void testWhileExample() {

        /* 수업목표. 사용자가 'y'라고 입력할 때 까지 반복해서 확인하는 예제를 이해할 수 있다. (대소문자 구분 X) */
        Scanner sc = new Scanner(System.in);

        char answer = '\u0000';         // while 조건식에 활용하기 위해 변수를 미리 선언(char의 초기값 설정)
        while(!(answer == 'y' || answer == 'Y')){
            System.out.println("y 또는 Y를 눌러주세요.");
            answer = sc.next().charAt(0);
        }
        System.out.println("시키는 대로 눌러줘서 감사합니다.");
    }
}
