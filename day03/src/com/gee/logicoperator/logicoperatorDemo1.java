package com.gee.logicoperator;

import java.util.TreeMap;

public class logicoperatorDemo1 {
    public static void main(String[] args) {
//    1.& 并且
//    两边都为真，才能为真；
        System.out.println(true & true);//true
        System.out.println(false & true);//false
        System.out.println(true & false);//false
        System.out.println(false & false);//false
        System.out.println();
//        2.|或者
//        都为假，才为假；
        System.out.println(true | true);//true
        System.out.println(false | true);//true
        System.out.println(true | false);//true
        System.out.println(false | false);//false
    }
}
