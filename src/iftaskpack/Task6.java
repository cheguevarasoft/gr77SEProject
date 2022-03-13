package iftaskpack;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("esas meblegi daxil edin");
        double esas = scr.nextDouble();
        double odenilecek = 0;
        double ferq = 0;

        if (esas>0&&esas<=300){

            ferq = esas*0.05;
        }else  if (esas>300&&esas<=500){

            ferq = esas*0.1;
        }else  if (esas>500&&esas<=700){

            ferq = esas*0.15;
        }
        else{
            ferq = esas*0.2;
        }

        odenilecek = esas-ferq;

        System.out.println("odenilecek mebleg : " + odenilecek);

    }
}
