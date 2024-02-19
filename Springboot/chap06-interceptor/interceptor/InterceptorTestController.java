package com.ohgiraffers.interceptor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
// 서블릿 필터는 bean을 건들일수 없지만 interceptor는 가능하다.

@Controller
public class InterceptorTestController {
    @GetMapping("stopwatch")
    public String handlerMethod() throws InterruptedException {
        System.out.println("핸들러 메소드 호출함...");

        Thread.sleep(1000);

        return "result";
    }
}
