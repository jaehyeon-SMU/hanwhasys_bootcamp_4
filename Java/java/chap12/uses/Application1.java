package com.ohgiraffers.section03.uses;

import java.io.*;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. 예외처리를 많이 사용하는 io 패키지에서 사용하는 구문 이해 */
        /* 설명.
         *  예외처리를 가장 많이 사용하게 되는 상황에서 try-catch 구문 실제 상황과 유사하게 연습
         *  문법보다 호출 흐름에 포커스
         * */
        System.out.println(new File("test.dat").getAbsoluteFile());

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("test1.dat"));

            String s="";
//            System.out.println(br.readLine());

            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            System.out.println("파일 못 찾겠어잉");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            /* 필기.
            *   예외처리 구문과 상관없이 반드시 수행해야 하는 경우 finally에 작성을 하며
            *   보통 사용한 자원을 반납할 목적으로 사용하게 된다.
            * */
            try{

                /* 설명.
                *   스트림이 생성되지 않았을 때 접근해서 close()메소드를 호출하게 되면 NullPointerException이
                *   발생할 수 있다. 따라서 NullPointerException 방지를 위한 if문을 활용하게 된다.
                * */
                if(br != null){

                    /* 설명.
                    *   입출력에서 사용한 스트림을 닫아주는 메소드이다.
                    *   API에서 확인해보면 IOException을 throws하는 메소드이기 때문에
                    *   finally 블럭 안이라도 또 예외 처리를 중첩으로 해 주어야 한다.
                    * */
                    br.close();
                }
            } catch (IOException e){
               e.printStackTrace();
            }
        }


    }
}