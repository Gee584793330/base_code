package com.gee.ifdemo;

import java.util.Scanner;

public class ifDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入酒量：");
        int wine = sc.nextInt();

        if (wine >= 10) {
            System.out.println("OK");
        }

    }
}

