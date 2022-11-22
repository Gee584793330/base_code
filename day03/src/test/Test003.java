package test;

import java.util.Random;
import java.util.Scanner;

public class Test003 {
    public static void main(String[] args) {
//        数字6是一个真正伟大的数字，键盘录入两个整数。
//        如果其中一个为 6，最终结果输出true。
//        如果它们的和为 6的倍数。最终结果输出true。
//        其他情况都是false。
        Scanner scr=new Scanner(System.in);
        System.out.print("请输入第一个值:");
        int number01=scr.nextInt();

        System.out.print("请输入第二个值:");
        int number02=scr.nextInt();

        //短路逻辑运算符进行判断
        boolean result=number01==6||number02 ==6||(number01+number02)%6==0;
        System.out.println(result);


    }
}
