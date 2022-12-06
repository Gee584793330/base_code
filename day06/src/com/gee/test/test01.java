package com.gee.test;

public class test01 {
    public static void main(String[] args) {
//        需求：定义一个方法，秋长方形的周长，将结果进行打印
//        目标：根据不同的需求，选择定义无参的方法，还是带参的方法
        getlength(5.2,2.3);
    }

//
    public static void getlength(double len, double width){
        double result=(len+width)*2;
        System.out.println(result);
    }
}
