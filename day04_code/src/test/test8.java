package test;

import com.sun.source.tree.BreakTree;
import com.sun.source.tree.CaseTree;

import java.util.Scanner;
import java.util.concurrent.SubmissionPublisher;

public class test8 {
    public static void main(String[] args) {
//        输入星期数；
        Scanner sc = new Scanner(System.in);
        System.out.print("输入星期数：");
        String weekday = sc.next();
        String sport = "休息";
        switch (weekday) {
            case "星期一":
//                System.out.println("今天运动为：跑步");
                sport = "跑步";
                break;
            case "星期二":
//                System.out.println("今天运动为：游泳");
                sport = "游泳";
                break;
            case "星期三":
                sport = "慢走";
                break;
            case "星期四":
                sport = "动感单车";
                break;
            case "星期五":
                sport = "拳击";
                break;
            case "星期六":
                sport = "爬山";
                break;
            case "星期日":
                sport = "好好吃一顿";
                break;
            default:
                break;
        }
        System.out.println("今天为：" + weekday + ",需要进行运动为：" + sport);
    }
}
