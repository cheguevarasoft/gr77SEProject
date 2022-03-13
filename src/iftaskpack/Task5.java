package iftaskpack;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ededi daxil edin");
        int bal = sc.nextInt();
        String netice = "";

        if (bal>=0&&bal<=100){

            if(bal>=0&&bal<=50){
                netice = "F";
            }else if(bal>=51&&bal<=60){
                netice = "E";
            }else if(bal>=61&&bal<=70){
                netice = "D";
            }else if(bal>=71&&bal<=80){
                netice = "C";
            }else if(bal>=81&&bal<=90){
                netice = "B";
            }else if(bal>=91&&bal<=100){
                netice = "A";
            }
        }
        else {
            netice = "bele bal yoxdur";
        }

        System.out.println("cavabi : "+netice);
    }

}
