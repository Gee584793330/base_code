package com.gee.arraydemo;

public class ArrayDemo2 {
    public static void main(String[] args) {

//        利用索引进行数组中元素进行访问；
//        1.获数组里面的元素
//        格式：数组名[索引]
        int[] arr={1,2,3,4,5};

//       获取地第一个元素；
//        其实就是0索引的元素
        int a=arr[0];
        System.out.println(a);

//      对数组元元素赋值
        arr[0]=100;
        System.out.println(arr[0]);
    }
}
