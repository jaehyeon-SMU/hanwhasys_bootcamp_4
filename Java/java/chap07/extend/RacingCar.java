package com.ohgiraffers.section01.extend;

public class RacingCar extends Car{

    public RacingCar() {
        super();
        System.out.println("RacingCar 클래스의 기본생성자 호출됨,,,,");
    }

    @Override
    public void run(){
        System.out.println("레이싱 자동차가 신나게 달립니다. 쌔애애애앵!~");
    }

    @Override
    public void soundHorn(){
        System.out.println("레이싱카는 경적따위 울리지 않습니다.");
    }

    public void drift(){
        System.out.println("끼이이이이이이이이이이이익 차가 드리프트 했습니다.");
    }
}
