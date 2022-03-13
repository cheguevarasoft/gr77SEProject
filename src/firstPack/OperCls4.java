package firstPack;

import java.util.Scanner;

public class OperCls4 {

    public static void main(String[] args) {

        //mentiqi
        Scanner scr = new Scanner(System.in);
        System.out.println("birinci deyeri daxil edin");
        int a = scr.nextInt();
        System.out.println("ikinci deyeri daxil edin");
        int b = scr.nextInt();
        System.out.println("ucuncu deyeri daxil edin");
        int c = scr.nextInt();
        System.out.println("dorduncu deyeri daxil edin");
        int d = scr.nextInt();


        boolean netice = a>b||c<=d;

        System.out.println("cavabi : " + netice);

    }
}
