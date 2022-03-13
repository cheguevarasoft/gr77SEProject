package loopspack;

import java.util.Scanner;

public class LoopsCls1 {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("birinci ededi daxil edin");
        int start = scr.nextInt();
        System.out.println("ikinci ededi daxil edin");
        int end = scr.nextInt();
        int netice = 0;
        for (int i = start;i<=end;i++) {

            netice = netice+i;

        }

        System.out.println(netice);
    }
}
