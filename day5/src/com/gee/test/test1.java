package com.gee.test;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        /*朋友聚会的时候可能会玩一个游戏:
        逢7过游戏规则:从任意一个数字开始报数，当你要报的数字是包含7或者是7的倍数时都要说过: 过
        需求:使用程序在控制台打印出1-100之间的满足逢七必过规则的数据*/
        Scanner sc = new Scanner(System.in);
        System.out.print("输入最大值：");
        int max = sc.nextInt();
        int count = 0;
        if (max >= 0 && max <= 100) {
            for (int i = 1; i <= max; i++) {
                if (i % 10 == 7 || i / 10 % 10 == 7 || i % 7 == 0) {
                    System.out.println("过");

                    continue;
                }
                System.out.println("i");
                System.out.println("符合条件数据有："+count+"个。");
            }
        } else {
            System.out.println("输入值超出范围！！");
        }

    }
}
