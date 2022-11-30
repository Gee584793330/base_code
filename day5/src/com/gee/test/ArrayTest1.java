package com.gee.test;

public class ArrayTest1 {
    public static void main(String[] args) {
        /*定义一个数组，存储1，2，3，4，5
         * 遍历数组得到每一个元素，并求和*/
//        分析：
//        1.定义一个数组，并添加数据
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
//        2.进行数组遍历；
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            sum = sum + arr[i];
        }
        System.out.println("遍历数值和为：" + sum);
//        3.进行求和
    }
}
