package com.gee.methoddemo;

public class MethodDemo3 {
    public static void main(String[] args) {
//        方法内进行定义两个变量并进行求和打印
        printSum();
    }


//    定义一个方法:
    public static void printSum(){
        int num1=10;
        int num2=20;
        int sum=num1+num2;

        System.out.println(sum);
    }
}
