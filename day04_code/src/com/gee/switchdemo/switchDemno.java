package com.gee.switchdemo;

import com.sun.source.tree.CaseTree;

import java.util.Scanner;

public class switchDemno {
    //    填写想吃的面种类，匹配返回对应值，不匹配则返回默认值
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("输入想吃的面：");
        String noodles = sc.next();
//    匹配输入值与可选择值
        switch (noodles) {
            case "兰州拉面":
                System.out.println("吃兰州拉面");
                break;
            case "热干面":
                System.out.println("吃热干面");
                break;
            case "北京炸酱面":
                System.out.println("吃炸酱面");
                break;
            case "陕西油泼面":
                System.out.println("吃陕西油泼面");
                break;
            default:
                System.out.println("吃方便面");
                break;
        }
    }
}