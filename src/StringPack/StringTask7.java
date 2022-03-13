package StringPack;

import java.util.Scanner;

public class StringTask7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("soz daxil edin");
        String ad = sc.nextLine();

        String tersad = "";

        for(int i=ad.length()-1;i>=0;i--){

            tersad += ad.charAt(i);
        }

        System.out.println("tersad "+ tersad);
    }

}
