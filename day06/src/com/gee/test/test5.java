package com.gee.test;

public class test5 {
    public static void main(String[] args) {
//        定义数组
        int[] arr = {11, 22, 33, 44};
        printArr(arr);

    }

    //    定义方法进行遍历数组
    public static void printArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            }else {
                System.out.print(arr[i]+",");
            }
        }
        System.out.println("]");
    }
}
