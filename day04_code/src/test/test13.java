package test;

import java.util.Scanner;

public class test13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入最小值：");
        int min = sc.nextInt();

        System.out.print("输入最大值：");
        int max = sc.nextInt();
        int count = 0;
        for (int i = min; i <= max; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println("符合要求个数为："+count);
    }

}
