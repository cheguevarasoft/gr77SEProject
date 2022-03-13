package loopspack;

import java.util.Scanner;

public class LoopsTask3 {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("ilk ededi daxil edin");
        int start = scr.nextInt();
        System.out.println("ikinci ededi daxil edin");
        int end = scr.nextInt();

        int say = 0;
        int cem = 0;


        for(int i = start;i<=end;i++){

            if (i%4==0&&i%6==0){
                cem+=i;
                say++;
            }

        }

        System.out.println(cem);
        System.out.println(say);

    }
}
