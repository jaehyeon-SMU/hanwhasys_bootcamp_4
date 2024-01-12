package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class C_ifElseIf {
    public void testSimpleIfElseIfStatement() {

        /* 수업목표. if-else-if문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */
        System.out.println("산 속에서 나무를 하면 나무꾼이 연못에 도끼를 빠뜨리고 말았다.");
        System.out.println("연못에서 산신령이 나타나 금도끼,은도끼,쇠도끼를 들고 나타났다.");
        System.out.println("나무꾼에게 셋 중 어떤 도끼가 나무꾼의 도끼인지 물어보았다.");

        System.out.println("어느 도끼가 너의 도끼냐? (1.금도끼, 2.은도끼, 3.쇠도끼: )");

        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();

        if (answer == 1) {
            System.out.println("아니잖아 너 진짜 죽을래?");
        } else if (answer == 2) {
            System.out.println("욕심이 과하구나 넌 진짜 X졌다");
        } else {
            System.out.println("응 아니야 내가 다 가질거야~ 금,은,쇠도끼 다 내꺼임~");
        }

        System.out.println("그렇게 산신령은 다시 연못 속으로 홀연히 사라지고 말았다.");
    }

    public void testNestedIfElseIfStatement() {

        /* 수업목표. 중첩된 if_else-if문의 흐름을 이해하고 적용할 수 있다. */
        /* 필기.
         *   ohgiraffers 대학의 김XX교수는 학생들 시험 성적을 수기로 계산해서 학점 등급을 메기는 채점방식 사용
         *   90점 이상이면 'A', 80점 이상이면 'B', 70점 이상이면 'C', 60점 이상이면 'D', 60점 미만은 'F'
         *   그래서 학생의 이름과 점수를 입력하면 자동으로 학점 등급이 계산 되는 프로그램 만들기로 했다.
         *   (추가로, 각 등급의 중간점수(95,85,75,...) 그 이상인 경우 '+'를 붙여서 등급을 세분화 해보자
         *
         *   필기.
         *       출력예시: XXX 학생의 점수는 86점이고, 등급은 B+입니다.
         *               프로그램을 종료합니다.
         * */
        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력하세요: ");
        String name = sc.next();

        System.out.print("점수를 입력하세요: ");
        int score = sc.nextInt();

        String grade;
        if (score >= 95) {
            grade = "A+";

        } else if (score >= 90) {
            grade = "A";

        } else if (score >= 85) {
            grade = "B+";

        } else if (score >= 80) {
            grade = "B";

        } else if (score >= 75) {
            grade = "C+";

        } else if (score >= 70) {
            grade = "C";

        } else if (score >= 65) {
            grade = "D+";

        } else if (score >= 60) {
            grade = "D";

        } else {
            grade = "F";
        }
        System.out.println(name + " 학생의 점수는 " + score + "점이고, 등급은 " + grade + " 입니다.");
        System.out.println("프로그램을 종료 합니다.");
    }
}
