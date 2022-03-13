package iftaskpack;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ededi daxil edin");
        int eded = sc.nextInt();
        String netice = "";

        if(eded%4==0&&eded%6==0) {
            netice = "bolunur";
        }else{
            netice = "bolunmur";
        }

        System.out.println("cavabi : "+netice);

    }
}
