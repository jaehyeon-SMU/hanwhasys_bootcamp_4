package com.ohgiraffers.common;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private final List<Product> items;      //final을 붙이면 초기화를 무조건 해줘야 한다.

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    /* 설명. 카트에 물품 담는 기능 */
    public void addItem(Product item){
        items.add(item);
    }

    /* 설명. 카트의 물품 꺼내기 기능 */
    public List<Product> getItems(){
        return items;
    }
}
