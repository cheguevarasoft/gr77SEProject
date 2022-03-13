package StringPack;

import java.util.Scanner;

public class StringTask2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ad soyadi daxil edin");

        String adsoyad = sc.nextLine();
        //Ilkin Karimov
        int index = adsoyad.indexOf(" ");

        String soyad = adsoyad.substring(index+1);

        System.out.println(soyad);

    }
}
