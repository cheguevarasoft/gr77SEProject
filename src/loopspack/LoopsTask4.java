package loopspack;

import java.util.Scanner;

public class LoopsTask4 {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println(" ededi daxil edin");
        int eded = scr.nextInt();
        int fakt = 1;

        for(int i=1;i<=eded;i++){

            fakt = fakt *i;
        }

        System.out.println(fakt);
    }
}
