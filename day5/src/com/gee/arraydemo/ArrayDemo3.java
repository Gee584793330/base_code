package com.gee.arraydemo;

public class ArrayDemo3 {
    public static void main(String[] args) {
//        1.定义数组
        int[] arr = {1, 2, 3, 4, 5};
//            2.获取里面所有的元素
/*        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        */
//        使用循环进行遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
