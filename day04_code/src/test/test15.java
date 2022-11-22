package test;

import java.util.Scanner;

public class test15 {
    public static void main(String[] args) {
/*        案例2: 回文数
        需求:给你一个整数 x。
        如果x 是一个回文整数，打印 true ，否则，返回 false。
        解释:回文数是指正序(从左向右) 和倒序(从右向左)读都是一样的整数.
        例如，121 是回文，而 123 不是。
        */
//        数字进行倒过来，然后进行比较

//        定义值：
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入数字：");
        int origin = sc.nextInt();
//        定义值存放转换后的值；
        int num=origin;
        int result = 0;
        while (num != 0) {
            int last = num % 10;
//          num进行左移一位；
            num = num / 10;
            result = result * 10 + last;
        }
        System.out.println("转换后数字为："+result);
        if (result==origin){
            System.out.println("该数字为回文数");
        }else {
            System.out.println("该数字不为回文数");
        }

    }
}
