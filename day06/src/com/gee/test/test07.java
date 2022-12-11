package com.gee.test;

import java.util.Scanner;

public class test07 {
    public static void main(String[] args) {
//        定义方法去判断某个数是否存在
        int[] arr={11,22,33,56,33,53,22,29,21};

//        判断值是否存在
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        boolean flag2=contains(arr,num);
        System.out.println(flag2);


    }

    public static boolean contains(int[] arr,int number){
        boolean flag=false;
        for (int i = 0; i <arr.length ; i++) {
            if(number==arr[i]){
                flag=true;
                break;
            }
        }
        return flag;
    }


}
