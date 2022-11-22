package com.gee.arithmeticoperator;

public class ArithmeticoperatorDemo2 {
    public static void main(String[] args) {
       //主入口
        //1.整数参与计算，结果只能为整数；
        //2.小数参与计算，结果可能为不精确结果；
        System.out.println(10/2);//5
        System.out.println(10/3);//3
        System.out.println(10.0/3);//3.3333333333333335

        //取模，取余。实际上也为除法计算，只不过是获取余数
        System.out.println(10%2);
        System.out.println(10%3);

        //应用场景；
//        1.可以用取模来判断A是否可以被B整除；
        // A%B     10%3
        //2.可以判断A是为偶数
        //A%2 如果结果过为0，则A为偶数，
    }
}
