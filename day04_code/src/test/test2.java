package test;

import com.sun.source.tree.IfTree;

public class test2 {
    public static void main(String[] args) {
        boolean isLightGreen = false;
        boolean isLightYellow = false;
        boolean isLightRed = true;
        if (isLightGreen) {
            System.out.println("Pass");
        } else if (isLightYellow) {
            System.out.println("slow");
        } else if (isLightRed) {
            System.out.println("Stop");
        }
    }

}
