package com.gee.test;

public class test02 {
    public static void main(String[] args) {
//        需求：定义一个方法，求圆的面积，将结果进行打印
//        目标：根据不同的需求，选择定义无参的方法，还是带参的方法
        getArea(4);
    }

//
    public static void getArea(double radius){
        double result=radius*radius*3.14;
        System.out.println(result);
    }
}
