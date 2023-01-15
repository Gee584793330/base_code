package com.gee.test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        /*机票价格按照淡季旺季、头等舱和经济舱收费，输入票价、月份和头等舱或者经济舱
        按照如下规则计算机票价格：旺季（5-10月）头等舱9折，经济舱8.5折，淡季（11月到来年4月）头等舱7折，经济舱6.5折*/
//        分析：
//        1.键盘录入相关内容机票价格、月份以及头等舱或者经济舱；
        Scanner sc=new Scanner(System.in);
        System.out.printf("请输入机票价格：");
        int ticketPrice= sc.nextInt();
        System.out.printf("请输入月份：");
        int month=sc.nextInt();
        System.out.printf("请输入座位等级（0头等舱，1经济舱）：");
        int seat=sc.nextInt();


//        判断旺季淡季；
        if (month>=5&&month<=10){

        }
    }

}
