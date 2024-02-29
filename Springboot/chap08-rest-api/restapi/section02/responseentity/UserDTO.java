package com.ohgiraffers.restapi.section02.responseentity;

import java.util.Date;

public class UserDTO {

    private int no;
    private String id;
    private String pwe;
    private String name;
    private java.util.Date enrollAt;

    public UserDTO() {
    }

    public UserDTO(int no, String id, String pwe, String name, Date enrollAt) {
        this.no = no;
        this.id = id;
        this.pwe = pwe;
        this.name = name;
        this.enrollAt = enrollAt;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwe() {
        return pwe;
    }

    public void setPwe(String pwe) {
        this.pwe = pwe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getEnrollAt() {
        return enrollAt;
    }

    public void setEnrollAt(Date enrollAt) {
        this.enrollAt = enrollAt;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "no=" + no +
                ", id='" + id + '\'' +
                ", pwe='" + pwe + '\'' +
                ", name='" + name + '\'' +
                ", enrollAt=" + enrollAt +
                '}';
    }
}
