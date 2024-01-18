package com.ohgiraffers.section08.Uses;

public class MemberFinder {

    public Member[] findAllMembers() {

        return MemberRepository.findAllMembers();
    }
}