package com.gee.test;

import java.util.Random;

public class test6 {
    public static void main(String[] args) {
//        需求：生成随机数：1~100
//        创建对象
        Random ra=new Random();

//        生成随机数'
        int num=ra.nextInt(100)+1;
        System.out.println(num);


//      秘诀：
//       用来生成任意数到任意数之间的随机数：7~15
//        1.让范围头尾都减去一个值，使范围从0开始，-7， 0~8
//        2.尾巴+1 8+1=9
/*//        3.最终的值，加上第一步减去的值；
        Random ra = new Random();
        int num = ra.nextInt(9) + 7;    //7~15
//        0~8 +7
//        1~15

        System.out.println(num);*/



    }
}
