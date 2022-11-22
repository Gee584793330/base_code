package test;

import java.util.Scanner;

public class test04 {
    public static void main(String[] args) {
        int price =400;
        Scanner sc=new Scanner(System.in);
        System.out.print("输入付的钱：");
        int payment=sc.nextInt();

        if (payment>=price){
            System.out.println("success");
        }else {
            System.out.println("fail");
        }
    }
}
