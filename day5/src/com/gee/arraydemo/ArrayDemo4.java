package com.gee.arraydemo;

public class ArrayDemo4 {
    public static void main(String[] args) {
//    /*定义一个数组，用来存班级中50个学生的姓名
//    姓名未知，等学生报道之后，再进行添加。*/
        ////格式:
        //数据类型[] 数组名 = new 数据类型[数组的长度];//在创建的时候，由我们自己指定数组的长度，由虚拟机给出默认的初始化值
       String[] arr=new String[50];
//       添加学生；
        arr[0]="张三";
        arr[1]="李四";
//        获取
        System.out.println(arr[0]);//张三
        System.out.println(arr[1]);//李四
        System.out.println(arr[2]);//默认初始值null
        //数组默认初始化值的规律
        //整数类型:默认初始化值:0
        int[] arr2=new int[10];
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
        //小数类型:默认初始化值:0.0
        System.out.println("小数类型:默认初始化值:0.0");
        float[] arr3=new float[3];
        System.out.println(arr3[0]);
        System.out.println(arr3[1]);
        System.out.println(arr3[2]);
        //字符类型:默认初始化值/u0000" 空格
        System.out.println("//字符类型:默认初始化值/u0000： 空格");
        char[] arr4=new char[3];
        System.out.println(arr4[0]);
        // 布尔类型:默认初始化值 false
        System.out.println("布尔类型:默认初始化值 false");
        boolean[] arr5=new boolean[2];
        System.out.println(arr5[0]);
        //引用数据类型:默认初始化值 nul1

    }
}
