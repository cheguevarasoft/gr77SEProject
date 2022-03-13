package OOPPack;

import java.util.Scanner;

public class MetodsCls {

    public static void main(String[] args) {

      /* yaz();

        Scanner sc = new Scanner(System.in);
        System.out.println("adi daxil edin");
        String name = sc.nextLine();

        yazdir(name);*/

     /* int data =   topla();
        System.out.println(data);*/

    /*
        System.out.println("ikinci deyeri daxil edin");
        int c = scr.nextInt();

        int netice = vurma(b,c);

        System.out.println(netice);
*/
        Scanner scr = new Scanner(System.in);
        System.out.println("birinci ededi daxil edin");
        int b = scr.nextInt();
        String a = tekcut(b);
        System.out.println(a);


    }

    //geriye deyer qaytarmayan bosh

   static void yaz(){

        System.out.println("Rashad Aliyev");

    }

    //geriye deyer qaytarmayan parametrli
    static void yazdir(String ad){

        System.out.println(ad);
    }

    //geriye deyer qaytaran bosh
   static int topla(){

        int netice = 70+80;
        return  netice;
    }

    //geriye deyer qaytaran parametrli

   static int vurma(int a,int b){

        int result = a*b;
        return result;
    }

    static String tekcut(int a){

        String netice = "";
        if(a%2==0){

            netice = "cut";
        }
        else{

            netice = "tek";
        }

        return  netice;
    }

}
