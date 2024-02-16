package com.ohgiraffers.exceptionhandler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.SQLOutput;

@Controller
@RequestMapping("/*")
public class ExceptionHandlerController {

    @GetMapping("simple-null")
    public String simpleNullPointerExceptionTest(){
        if(true) {
            throw new NullPointerException();
        }

        return "/";
    }

    @GetMapping("simple-user")
    public String simpleUserExceptionTest() throws MemberRegistException{

        if(true){
            throw new MemberRegistException("당신 같은 사람은 땡벌~");
        }

        return "/";
    }

    @GetMapping("annotation-null")
    public String annotationNullPointerExceptionTest(){
        String str = null;
        System.out.println("str.charAt(0): "+ str.charAt(0));

        return "/";
    }

    /* 설명. 이 클래스만 해당되는 지역범위 예외처리 설정 */
    @ExceptionHandler(NullPointerException.class)
    public String nullPointerExceptionHandler(){
        System.out.println("이 Controller에서 Null Pointer 발생 시 여기 오는지 확인");

        return "error/nullPointer";
    }

    @GetMapping("annotation-user")
    public String userExceptionTest() throws MemberRegistException{
        if(true){
            throw new MemberRegistException("너는 진짜 안돼");
        }

        return "/";
    }

    @ExceptionHandler(MemberRegistException.class)
    public String userExceptionHandler(Model model, MemberRegistException exception){
        model.addAttribute("exception",exception);

        return "error/memberRegist";
    }


}
