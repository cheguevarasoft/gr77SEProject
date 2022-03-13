package loopspack;

import java.util.Scanner;

public class LoopsTask1 {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("ilk ededi daxil edin");
        int start = scr.nextInt();
        System.out.println("ikinci ededi daxil edin");
        int end = scr.nextInt();

        int cutcem = 0;
        int tekcem = 0;
        int cutsay = 0;
        int teksay = 0;

        for(int i = start;i<=end;i++){

            if (i%2==0){
                cutcem+=i;
                cutsay++;
            }
            else{
                tekcem+=i;
                teksay++;
            }
        }

        System.out.println(cutcem);
        System.out.println(tekcem);
        System.out.println(cutsay);
        System.out.println(teksay);




    }

}
