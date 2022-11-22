package test;

import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
//       获取输入输入据:
        Scanner sc = new Scanner(System.in);
        System.out.print("输入分数：");
        int score = sc.nextInt();

//        对异常数据处理；
        if (score > 0 && score <= 100) {
//         判断分数的处理；
            if (score >= 95 && score <= 100) {
                System.out.println("自行车一辆");
            } else if (score >= 90 && score <= 94) {
                System.out.println("游乐园");
            } else if (score >= 80 && score <= 89) {
                System.out.println("变形金刚");
            } else {
                System.out.println("打");
            }
        }else {
            System.out.println("数据错误");
        }
    }
}
