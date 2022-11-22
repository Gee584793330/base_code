package test;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
//        录入一个三位数，分别获取个位、十位、百位

//        1.键盘录入：
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个三位数：");
        int num=sc.nextInt();

//        获取个位、十位、百位；
        int gewei=num%10;
        int shi=num/10%10;
        int bai=num/100%10;

//        输出相关值：
        System.out.println("个位："+gewei);
        System.out.println("十位："+shi);
        System.out.println("百位："+bai);

    }
}
