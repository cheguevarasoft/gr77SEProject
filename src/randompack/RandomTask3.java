package randompack;

import java.util.Random;
import java.util.Scanner;

public class RandomTask3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Shifrenin uzunlugunu daxil edin");

        int uzunluq = sc.nextInt();

        Random rand = new Random();
        String shifre = "";
        for(int i=0;i<uzunluq;i++){
            int eded = rand.nextInt(10);
            shifre+=eded;
        }
        System.out.println(shifre);
    }
}  //523241
