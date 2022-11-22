package test;

import java.util.Scanner;

public class test16 {
    public static void main(String[] args) {
/*        需求:给定两个整数，被除数和除数(都是正数，且不超过int的范围)
    将两数相除，要求不使用乘法、除法和 % 运算符
    得到商和余数。*/
        Scanner sc=new Scanner(System.in);
        System.out.print("被除数:");
        int dividend=sc.nextInt();

        System.out.print("除数:");
        int divisor=sc.nextInt();
        int cout=0;
        while (dividend>=divisor){
            dividend=dividend-divisor;
            cout++;
        }
        System.out.println("商为："+cout);
        System.out.println("余数为："+dividend);

    }
}
