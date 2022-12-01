package com.gee.test;

import java.util.Random;
import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
//      需求：程序生成一个1~100的随机数，使用程序猜出这个数字是多少
//        拓展：当 3次未猜中直接提示，猜中了
        int count=0;
//        分析：
//        生成一个1~100的随机数；
        Random ra =new Random();
        int num= ra.nextInt(100)+1;

//        2.猜这个数是多少
        Scanner sc =new Scanner(System.in);
        System.out.print("请输入猜测的数字：");
        while (true){
            int guess=sc.nextInt();
            if (count==3){
                System.out.println("猜对了！数字为："+guess);
                break;
            }
            if (guess>num){
                System.out.println("输入值过大！！");
                System.out.print("重新输入：");
//                guess=sc.nextInt();
            }else if (guess<num) {
                System.out.println("输入值过小！！");
                System.out.print("重新输入：");
//                guess = sc.nextInt();
            }else{
                System.out.println("猜对了，数字为："+guess);
                break;
            }
            count++;
        }
    }
}
