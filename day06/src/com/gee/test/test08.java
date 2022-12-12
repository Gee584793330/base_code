package com.gee.test;

import java.util.Scanner;

public class test08 {
    public static void main(String[] args) {
//        需求：定义一个方法copyOfRange(int[] arr,int from,int to)
//        功能：将数组arr中从索引from(包含from)开始。到索引to结束（不包含to）的元素复制到新的数组中，将数组返回
        int[] arr = {11, 22, 33, 44, 55, 66, 77, 88, 99};

        Scanner sc1 = new Scanner(System.in);
        System.out.print("输入索引from：");
        int from = sc1.nextInt();

        System.out.print("输入索引to：");
        int to = sc1.nextInt();

        int[] copyArr=copyOfRange(arr,from,to);
        
//        便利数组
        for (int i = 0; i < copyArr.length; i++) {
            System.out.print(copyArr[i]+" ");
        }

    }

    public static int[] copyOfRange(int[] arr, int from, int to) {
        int[] newArr = new int[to - from];
        int index = 0;
        for (int i = from; i < to; i++) {
            newArr[index]=arr[i];
            index++;
        }
        return newArr;
    }
}
