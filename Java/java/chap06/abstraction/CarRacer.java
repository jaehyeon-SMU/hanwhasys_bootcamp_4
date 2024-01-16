package com.ohgiraffers.section03.abstraction;

public class CarRacer {

    /* 설명. 차 한대(Car 객체 하나)를 필드로 가진다. */
    private Car myCar = new Car();

    public void startUp() {
        this.myCar.startUp();
    }

    public void stepAccelator() {
        this.myCar.go();
    }

    public void stepBreak() {
        this.myCar.stop();
    }

    public void turnOff() {
        this.myCar.turnOff();
    }
}
