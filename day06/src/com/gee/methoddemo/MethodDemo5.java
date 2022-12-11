package com.gee.methoddemo;

public class MethodDemo5 {
    public static void main(String[] args) {
////      目标：掌握带返回值得定义以及调用格式
////       直接调用：
//        getSum(10, 20, 30);
//
////        赋值调用
//        double sum = getSum(10, 20, 30);
//        System.out.println(sum);
//
////        输出调用；
//        System.out.println(getSum(10, 20, 30));

//        计算第一个季度数值：
        double sum1 = getSum(10, 20, 30);
//        计算第二个季度数值：
        double sum2 = getSum(20, 30, 40);
//        计算第三个季度数值：
        double sum3 = getSum(30, 40, 40);
//        计算第四个季度数值：
        double sum4 = getSum(10, 20, 40);

        double sum=sum1+sum2+sum3+sum4;
        System.out.println(sum);

    }


    //    定义一个方法:
    public static double getSum(double num1, double num2, double num3) {
        double resul = num1 + num2 + num3;
        return resul;
    }
}
