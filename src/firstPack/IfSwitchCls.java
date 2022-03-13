package firstPack;

import java.util.Scanner;

public class IfSwitchCls {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("birinci deyeri daxil edin");
        int a = sc.nextInt();
        System.out.println("ikinci deyeri daxil edin");
        int b = sc.nextInt();
        int c = 0;

        if (a>b){

           c = a+b;

        }else if(a<b){

            c = a-b;
        }else{

            c = a*b;
        }

        System.out.println("cavabi : "+c);
    }

}
