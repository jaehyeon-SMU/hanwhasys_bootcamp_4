package com.ohgiraffers.section08.object_array;

public class Application {

    public static void main(String[] args) {

        /* 수업목표. 객체 배열에 대해 이해 할 수 있다. */
        Car car1 = new Car("페라리" , 300);
        Car car2 = new Car("람보르기니" , 300);
        Car car3 = new Car("롤스로이스" , 300);
        Car car4 = new Car("부가티" , 300);
        Car car5 = new Car("포터" , 300);

        car1.driveMaxSpeed();
        car2.driveMaxSpeed();
        car3.driveMaxSpeed();
        car4.driveMaxSpeed();
        car5.driveMaxSpeed();

        Car[] carArr = new Car[5];
        carArr[0] = new Car("페라리",300);
        carArr[1] = new Car("람보르기니",510);
        carArr[2] = new Car("롤스로이스",250);
        carArr[3] = new Car("부가티",400);
        carArr[4] = new Car("포터",500);

//        for (int i = 0; i < ; i++) {}

        for(Car car: carArr){
            car.driveMaxSpeed();
        }
    }
}
