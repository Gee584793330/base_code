package test;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class test9 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("输入整数表示星期:");
        int week=sc.nextInt();

        switch (week){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("今天是工作日");
                break;
            case 6:
            case 7:
                System.out.println("今天休息日");
            default:
                System.out.println("输入不不合法");
        }



    }
}
