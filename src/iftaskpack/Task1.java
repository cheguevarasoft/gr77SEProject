package iftaskpack;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
        System.out.println("ededi daxil edin");
        int eded = sc.nextInt();
        String netice = "";

        if(eded>0){
            netice = "musbet";
        }else if(eded<0){
            netice = "menfi";
        }else{
            netice = "sifir";
        }

        System.out.println("cavabi : "+netice);

    }

}
