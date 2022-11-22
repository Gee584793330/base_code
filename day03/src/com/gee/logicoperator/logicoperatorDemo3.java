package com.gee.logicoperator;

public class logicoperatorDemo3 {
    public static void main(String[] args) {
//    1.&&短路与
//      表示两边都为真，结果才为真
        System.out.println(true && true);//true
        System.out.println(false && true);//false
        System.out.println(true && false);//false
        System.out.println(false && false);//false

//    2.||短路或
//      表示两边都为假，结果才为假
        System.out.println(true|| true);//true
        System.out.println(false || true);//true
        System.out.println(true || false);//true
        System.out.println(false || false);//false
        System.out.println();


//      3.短路逻辑运算符；
//      简单理解：当左边的表达式能确定结果时，那么右边不会参与计算；
        int  a =10;
        int b=10;
        boolean result=++a<5&&++b<5;
        System.out.println(result);
        System.out.println(a);
        System.out.println(b);
    }
}
