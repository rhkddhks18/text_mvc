package org.example;

import java.util.Scanner;

public class Container {
    private static Scanner sc;

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
