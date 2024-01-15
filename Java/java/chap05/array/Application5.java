package com.ohgiraffers.section01.array;

import java.util.Random;

public class Application5 {

    public static void main(String[] args) {

        /* 수업목표. 배열을 사용한느 예시를 통해 카드게임 작성 */
        String[] shape = {"SPADE", "CLOVER", "HEART", "DIAMOND"};
        String[] cardNumbers = {"2","3","4","5","6","7","8","9","10","Jack","Queen","KING","ACE"};

        int randomShapeIndex = (int)(Math.random() * 4);
        int randomCardNumberIndex = new Random().nextInt(13);

        System.out.println("당신이 뽑은 카드는 " + shape[randomShapeIndex] + " " + cardNumbers[randomCardNumberIndex] + "\" 카드 입니다.");
    }
}
