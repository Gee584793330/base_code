package test;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;

public class Test005 {
    public static void main(String[] args) {
        /*需求:一座寺庙里住着三个和尚，已知他们的身高分别为150cm、21cm、165cm,请用程序实现获取这三个和尚的最高身高。*/
//        定义身高：
        int hight01 = 150;
        int hight02 = 210;
        int hight03 = 165;

//        对比01和02
        int max = hight01 > hight02 ? hight01 : hight02;

//        对比max和03
//        max已进行定义，则不需要定义
        max = max > hight03 ? max : hight03;

        System.out.println("身高最高为：" + max);
    }
}
