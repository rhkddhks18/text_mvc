package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.example.member.entity.Member;

import java.util.Scanner;

public class Container {
    private static Scanner sc;
    @Getter
    @Setter
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

}
