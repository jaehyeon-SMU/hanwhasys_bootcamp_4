package com.ohgiraffers.section01.array;

import java.util.Arrays;
import java.util.Scanner;

public class Application4 {
    public static void main(String[] args) {
        /* 수업목표. 배열을 사용하는 예시 이해 및 적용 */
        /* 필기. 5명의 자바 점수를 정수로 입력 받아 합계 및 평균을 실수(double)로 구하는 프로그램 */

        int[] score = new int[5];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < score.length; i++) {
            System.out.print((i+1)+"번째 학생의 자바점수를 입력해 주세요: ");
            score[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(score));

        /* 필기. 합계(sum) 구하기 */
        int sum = 0;
        for(int perScore: score) {
            sum += perScore;
        }
        System.out.println("합계: "+sum);

        /* 필기. 평균(avg) 구하기 */
        double avg = 0.0;
        avg = sum / (double) score.length;
        System.out.println("평균: "+avg);
    }
}