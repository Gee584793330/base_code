package com.gee.test;

import java.util.Random;

public class test5 {
    public static void main(String[] args) {
//        需求:程序自动生成一个1-100之间的随机数字，使用程序实现猜出这个数字是多少?

        Random ram= new Random();
        int num2=ram.nextInt(1000);
        System.out.println(num2);
    }
}
