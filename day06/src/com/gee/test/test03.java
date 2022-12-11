package com.gee.test;

public class test03 {
    public static void main(String[] args) {
//      需求：要能区分什么时候需要使用带参数返回值的方法；
//        需求：定义方法，比较两个长方形的面积
//        调用方法进行获取面积；
        double area1=getArea(5.2,2.3);
        double area2=getArea(6.2,3.2);
        if (area1>area2){
            System.out.println("第一个大");
        }else if(area1<area2){
            System.out.println("第二个大");
        }else {
            System.out.println("一样大");
        }

    }

//  定义一个方法求长方形的面积
    public static double getArea(double len,double width){
        double area=len*width;
        return area;
    }


    //    需要干什么：比较两个长方形的面积；
//    两个长，两个宽
//    public static int compare(double len1, double width1, double len2, double width2) {
//        double area1 = len1 * width1;
//        double area2 = len2 * width2;
//        if (area1 > area2) {
//            System.out.println("第一个大");
//        }else {
//            System.out.println("第二个大");
//        }
//    }
}
