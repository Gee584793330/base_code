package com.gee.ternaryOperator;

public class ternaryoperatorDemo1 {
    public static void main(String[] args) {
//        使用三元运算符，获取两个数里面较大的值
//        定义两个值：
        int num01 = 10;
        int num02 = 20;
//      三元运算符获取较大的值；
//        格式 ：关系表达式？表达式1：表达式2；

        int max = num01 > num02 ? num01 : num02;
        System.out.println(max);
        System.out.println(num01 > num02 ? num01 : num02);
    }
}
