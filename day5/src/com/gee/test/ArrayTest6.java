package com.gee.test;

import java.util.Random;

public class ArrayTest6 {
    public static void main(String[] args) {
/*      需求:定义一个数组，存入1,2,3,4,5。
        按照要求交换索引对应的元素
        交换前: 1,2,3,4,5
        交换后: 5,2,3,4,1
 */
            int[] arr={1,2,3,4,5};

//           遍历数组从0开始打乱数组的顺序
        Random r=new Random();
        for (int i = 0; i <arr.length; i++) {
            int randomIndex=r.nextInt(arr.length);
            int temp=arr[i];
            arr[i]=arr[randomIndex];
            arr[randomIndex]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"   ");
        }


    }
}
