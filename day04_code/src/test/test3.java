package test;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("输入余额:");
        int money=sc.nextInt();
         if (money>=100){
             System.out.println("大餐");
         }else {
             System.out.println("沙县");
         }
    }
}
