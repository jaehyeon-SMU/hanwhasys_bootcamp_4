package com.ohgiraffers.assertions.section01.jupiter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JupiterAssertionsTests {
    /* 수업목표. junit5에서 제공하는 Assertions에서 제공하는 메소드에 대해 이해하고 활용할 수 있다. */

    /* 목차. 1. assertEquals */
    /* 필기. assertEquals(expected, actual)메소드는 실제 값과 기대 값의 일치 여부를 동일성으로 판단한다. */

    @Test
    public void testAssertEquals(){


        /* 설명. 1. given */
        int firstNum = 10;
        int secondNum = 20;
        int expected = 30;

        /* 설명. 2. when */
        Calculator calculator = new Calculator();
        int result = calculator.plusTwoNumbers(firstNum,secondNum);

        /* 설명. 3. then */
//        Assertions.assertEquals(expected,result);
//        Assertions.assertEquals(expected,result,1);
        Assertions.assertEquals(expected,result,"이건 정확해야 해!!!!");
    }

    /* 필기. assertNotEquals(expected,actual) 메소드는 실제 값과 기대 값의 불일치 여부를 동일성으로 판단한다. */
    @Test
    @DisplayName("인스턴스 동일성 비교 테스트")
    void testAssertNotEqualsWithInstances(){

            //given
            Object obj1 = new Object();

            //when
            Object obj2 = new Object();

            //then
            Assertions.assertNotEquals(obj1,obj2);

            /* 설명. equals()와 hashCode()가 오버라이딩 되어 있다면 동등비교로 판단한다. */
        }


    /* 목차. 3. assertNull */
    @Test
    @DisplayName("null인지 테스트")
    void testAssertNull(){
        String str;
        str = null;
        Assertions.assertNull(str);
    }

    /* 목차. 4. assertNotNull */
    @Test
    @DisplayName("null이 아닌지 테스트")
    void testAssertNotNull(){
        String str;
        str = "java";
        Assertions.assertNotNull(str);
    }

    /* 목차. 5. 자주쓰는 나머지 간단한 단정문 */
    /* 설명. assertTrue(), assertFalse() */

    /* 목차. 6. assertAll */
    @Test
    @DisplayName("동시에 여러 가지 값에 대한 검증을 수행하는 경우 테스트")
    void testAssertAll(){

        //given
        String firstName = "길동";
        String lastName = "홍";

        //when
        Person person = new Person(firstName,lastName);

        //then
        Assertions.assertAll(
                "그룹화된 테스틔 이름 (테스트 실패시 보여짐)",
                () -> Assertions.assertEquals(firstName,person.getFirstName(), () -> "firstName이 잘못됨"),
                () -> Assertions.assertEquals(lastName,person.getLastName(), () -> "lastName이 잘못됨")
        );
    }

}
