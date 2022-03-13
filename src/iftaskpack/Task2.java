package iftaskpack;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ededi daxil edin");
        int eded = sc.nextInt();
        String netice = "";

        if(eded%2==0) {
            netice = "cut";
        }else{
            netice = "tek";
        }

        System.out.println("cavabi : "+netice);

    }
}
