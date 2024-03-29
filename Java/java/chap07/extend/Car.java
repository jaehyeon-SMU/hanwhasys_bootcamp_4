package com.ohgiraffers.section01.extend;

public class Car {

    /* 설명. 자동차의 속성과 기능을 나열 */
    private boolean runingStatus;

    public Car() {
        System.out.println("Car 클래스의 기본 생성자 호출됨,,");
    }

    public void run(){
        runingStatus = true;
        System.out.println("자동차가 달리기 시작합니다.");
    }

    public void soundHorn(){
        if(isRunning()){
            System.out.println("빵! 빵!");
        } else {
            System.out.println("주행중이 아닐 때는 경적이 울리지 않습니다.");
        }
    }

    public boolean isRunning(){
        return runingStatus;
    }

    public void stop(){
        runingStatus = false;
        System.out.println("자동차가 멈춥니다.");
    }
}
