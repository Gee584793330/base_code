package test;

import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("输入用户会员级别：");
        int level=sc.nextInt();
        int price=1000;
        if(level>=1&&level<=3){
            if (level==1){
                System.out.println("会员即级别为："+level+","+"折后价格为："+(price*0.9));
            }else if (level==2) {
                System.out.println("会员即级别为：" + level + "," + "折后价格为：" + (price * 0.8));
            }else{
                System.out.println("会员即级别为："+level+","+"折后价格为："+(price*0.7));
            }
        }else {
            System.out.println("非会员，不打折");
        }

    }
}
