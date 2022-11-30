package com.gee.test;

public class ArrayTest2 {
    public static void main(String[] args) {
        /*定义一个数组，存储1，2，3，4，5，6，7，8，9，10
         遍历数组得到每一个元素，统计数组中含有多少个可以能被3整除的数字*/
//        分析：
//        1.定义一个数组，并添加数据
        int[] arr = {1, 2, 3, 4, 5,6,7,8,9,10};
//        2.遍历并判断
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%3==0){
                count++;
                System.out.println(arr[i]);
            }
        }
        System.out.println("可以能被3整除的数字有："+count+"个");
    }
}
