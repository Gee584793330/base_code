package test;

import java.util.Random;
import java.util.Scanner;

public class Test002 {
    public static void main(String[] args) {
//        需求:
//        您和您的约会对象正试图在餐厅获得一张桌子。
//        键盘输入两个整数，表示你和你约会对象衣服的时髦度，《手动某入0~10之间的整数，不能录入其他)如果你的时髦程度度大于你对象的时髦程度，相亲就成功，输出true。否则输出false。"/
////      1.键盘录入两个整数表示衣服的时髦度；
        Scanner sc =new Scanner(System.in);
        System.out.print("输入自己的时髦值:");
        int myfashion = sc.nextInt();

//        设置 对象时髦值：
        Random rs=new Random();
        int otherFashion =rs.nextInt(10);
        System.out.println("对象时髦度："+otherFashion);

//        对比两人时髦度：
        boolean result=myfashion>otherFashion;
        System.out.println(result);

    }
}
