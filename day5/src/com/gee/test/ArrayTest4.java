package com.gee.test;

public class ArrayTest4 {
    public static void main(String[] args) {
//     求最大值：33，5，22，44，55
        int[] arr = {33, 5, 22, 44, 55};
        int max = arr[0];
        int min = arr[0];
        int flat1 = 0;
        int flat2 = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                flat1 = i;
            }

            if (arr[i] < min) {
                min = arr[i];
                flat2 = i;
            }


        }
        System.out.println("最大值为arr[" + flat1 + "]，值为：" + max);
        System.out.println("最小值为arr[" + flat2 + "]，值为：" + min);
    }
}
