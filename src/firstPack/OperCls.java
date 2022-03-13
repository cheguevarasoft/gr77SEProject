package firstPack;

import java.util.Scanner;

public class OperCls {

    public static void main(String[] args) {

        //arifmetik
        Scanner scr = new Scanner(System.in);
        System.out.println("birinci deyeri daxil edin");
        int a = scr.nextInt();
        System.out.println("ikinci deyeri daxil edin");
        int b = scr.nextInt();

        int c = a%b;

        System.out.println("cavabi : " + c);

    }
}
