package com.ohgiraffers.section02.annotation.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary        // 프라이머리 지정을 통해 여러가지 bean중에 이 primary를 우선적으로 고른다.
public class Squirtle implements Pokemon {

    @Override
    public void attack() {
        System.out.println("꼬부기 물대포 발사~~~");
    }
}
