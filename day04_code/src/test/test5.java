package test;

import java.awt.image.TileObserver;
import java.util.Random;
import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
//        判断座位左右；
//        手动输入座位号；
//        Scanner sc=new Scanner(System.in);
//        System.out.print("输入票号:");
//        int ticket =sc.nextInt();


//      获取随机数
        Random rd = new Random();
        int ticket = rd.nextInt(100 - 1) + 1;
//        System.out.println("票号为：" + ticket);

//      判定票为有效票
        if (ticket > 0 && ticket <= 100) {
            System.out.println("票号合法且票号为：" + ticket);
//       判断票号奇偶；
            if (ticket % 2 != 0) {
                System.out.println("票为左侧位置");
            } else {
                System.out.println("票为右侧位置");
            }
        } else {
            System.out.println("票号不合法，票号为：" + ticket);
        }
    }
}
