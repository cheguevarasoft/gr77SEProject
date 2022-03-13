package loopspack;

import java.util.Scanner;

public class LoopsTask5 {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("esasi daxil edin");
        int esas = scr.nextInt();
        System.out.println("quvveti daxil edin");
        int quvvet = scr.nextInt();

        int netice = 1;

        for(int i = 1;i<=quvvet;i++){

            netice = netice*esas;
        }

        System.out.println(netice);
    }
}
