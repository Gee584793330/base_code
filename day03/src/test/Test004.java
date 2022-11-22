package test;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Test004 {
    public static void main(String[] args) {
///*需求:动物园里有两只老虎，体重分别为通过键盘录入获得请用程序实现判断两只老虎的体重是否相同。*/I
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一老虎体重：");
        int tiger01 = sc.nextInt();
        System.out.print("请输入第二老虎体重：");
        int tiger02 = sc.nextInt();

//        对比老虎体重；
        String result=tiger01==tiger02?"相同":"不同";
        System.out.println(result);
    }
}
