package com.gee.arraydemo;

public class ArrayDemo1 {
    public static void main(String[] args) {
//        需求1：定义一个数组存储5个学生的年龄'
        int[] age = new int[]{7, 8, 9, 10, 11};
        int[] age2 = {7, 8, 9, 10, 11};
//        需求2：定义一个数组存储3个学生的姓名
        String[] name = {"小明", "小张", "小李"};
        String[] name2 = new String[]{"小明", "小张", "小李"};
//        需求3：定一个数组存储4个学生的身高
        double[] hight = {150.2, 160.5, 172.3, 158.4};
        double[] hight2 = new double[]{150.2, 160.5, 172.3, 158.4};
        System.out.println(hight2);//[D@6bdf28bb
//        拓展：
//        解释地址值的含义：
//        [:表示为数组；
//        D:表示为double；
//        @:表示间隔符号（固定格式）
//        6bdf28bb:实际的数组地址值（十六进制）
//
    }
}
