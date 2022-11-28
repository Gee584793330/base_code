package com.gee.test;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        /*需求:键盘录入一个大于等于2的整数 x ，计算并返回 x 的平方根结果只保留整数部分 ，小数部分将被舍去 。*
         */
        Scanner sc=new Scanner(System.in);
        System.out.print("输入一个数：");
        int num=sc.nextInt();

        for (int i=1;i<=num;i++){
            if (i*i==num){
                System.out.println("平方根为："+i);
                break;
            }else if (i*i>num){
                System.out.println("平方根整数部分为："+(i-1));
                break;
            }

        }
    }
}
