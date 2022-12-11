package com.gee.test;

public class test6 {
    public static void main(String[] args) {
//     设计一个方法返回值最大值
        int[] arr={11,22,44,55,22};
        int max=printMax(arr);
        System.out.println(max);

    }
    public static int printMax(int[] arr){
        int max=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

}
