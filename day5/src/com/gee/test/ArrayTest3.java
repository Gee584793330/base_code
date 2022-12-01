package com.gee.test;

public class ArrayTest3 {
    public static void main(String[] args) {
        /*定义一个数组，存储1，2，3，4，5，6，7，8，9，10
         要求：
         当为奇数，则当前数字扩大两倍；
         当为偶数，则当前数字变为二分之一*/
//        分析：
//        1.定义一个数组，并添加数据
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        2.遍历并判断
        for (int i = 0; i < arr.length; i++) {
            System.out.println("原始值为" + arr[i]);
            if (arr[i] % 2 == 0) {
                arr[i] = arr[i] / 2;
                System.out.println("该元素为偶数，处理后为：" + arr[i] / 2);
            } else if (arr[i] % 2 != 0) {
                arr[i] = arr[i] * 2;
                System.out.println("该元素为奇数，处理后为：" + arr[i] * 2);
            }
        }
//        再次遍历
        for (int j = 0; j <arr.length; j++) {
            System.out.println(arr[j]);
        }
    }
}
