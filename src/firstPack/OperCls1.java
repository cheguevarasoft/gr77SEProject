package firstPack;

import java.util.Scanner;

public class OperCls1 {

    public static void main(String[] args) {

        //menimsetme
        Scanner scr = new Scanner(System.in);
        System.out.println("birinci deyeri daxil edin");
        int a = scr.nextInt();
        System.out.println("ikinci deyeri daxil edin");
        int b = scr.nextInt();

        a = a%b;

        System.out.println("cavabi : " + a);

    }
}
