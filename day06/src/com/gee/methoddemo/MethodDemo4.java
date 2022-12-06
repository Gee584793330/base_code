package com.gee.methoddemo;

public class MethodDemo4 {
    public static void main(String[] args) {
//      掌握带参数的方法定义格式和调用格式
        printSum(100,200);

    }


//    定义一个方法:
    public static void printSum(int num1,int num2){

        int sum=num1+num2;

        System.out.println(sum);
    }
}
