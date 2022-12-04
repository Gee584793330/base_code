package com.gee.test;

import java.util.Random;

public class ArrayTest5 {
    public static void main(String[] args) {
/*      需求：生成10个1~100之间的随机数存入数组
        1）出所有数据的和
        2）求所有数据的平均数
        3）统计有多少个数据比平均值小*/
        int[] arr=new int[10];
        Random ra=new Random();
        int sum=0;
        int count=0;
        for (int i = 0; i <arr.length; i++) {
            arr[i]=ra.nextInt(100)+1;
            sum=sum+arr[i];
            System.out.println(arr[i]);
        }
        System.out.println("总和为："+sum);
        int Avg=sum/arr.length;
        System.out.println("所有数的平均值为："+Avg);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<Avg){
                count++;
            }
        }
        System.out.println("比平均值小的有"+count+"个。");



    }
}
