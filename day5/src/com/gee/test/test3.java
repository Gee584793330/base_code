package com.gee.test;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
//        判断一个数是否为质数；
        Scanner sc =new Scanner(System.in);
        System.out.print("输入一个整数：");
        int  num= sc.nextInt();
//        定义一个变量进行标记；
//        标记num是不是一个质数
//        TRUE-是
//        FALSE不是
        boolean flag=true;

        for(int i=2;i<num;i++) {
            if (num % i == 0) {
                flag =false;
//                System.out.println("不是质数");
                break;
            }
        }
        if (flag) {

            System.out.println(num+"是质数");
        }else {
            System.out.println(num+"不是质数");
        }

    }
}
