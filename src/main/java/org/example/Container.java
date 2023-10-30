package org.example;

import org.example.member.entity.Member;

import java.util.Scanner;

public class Container {
    private static Scanner sc;
    private static Member loginedMember;

    Container(Scanner sc) {
        this.sc = sc;
    }

    public static void init() {
        sc = new Scanner(System.in);
    }

    public static Scanner getScanner() {
        return sc;
    }

    public static Member getLoginedMember() {
        return loginedMember;
    }

    public static void setLoginedMember(Member loginedMember) {
        Container.loginedMember = loginedMember;
    }
}
