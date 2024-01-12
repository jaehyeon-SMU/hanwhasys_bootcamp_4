package com.ohgiraffers.section03.math;

public class Application2 {

    public static void main(String[] args) {

        /*  수업목표. 사용자 지정 범위의 난수를 발생시킬 수 있다.(ver. Java.Lang.Math 클래스) */

        /* 목차. 1. 0~9까지의 난수 생성 */
        int random1 = (int)(Math.random() * 10);
        System.out.println("random1 = " + random1);

        /* 목차. 2. 1~10까지의 난수 생성 */
        int random2 = (int)(Math.random() * 10);
        System.out.println("random2 = " + random2);

        /* 목차. 3. 10~15까지의 난수 생성 */
        int random3 = (int)(Math.random() * 6) + 10;
        System.out.println("random3 = " + random3);

        /* 목차. 4. -128~127까지의 난수 생성 */
        int random4 = (int)(Math.random() * 256) - 128;
        System.out.println("random4 = " + random4);
    }
}
