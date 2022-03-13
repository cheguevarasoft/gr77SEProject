package StringPack;

import java.util.Scanner;

public class StringTask3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ad soyadi ata adi daxil edin");
        String adsoyad = sc.nextLine();
        // Ilkin Karimov Adil
        int index = adsoyad.indexOf(" ");
        int last = adsoyad.lastIndexOf(" ");
        String soyad = adsoyad.substring(index+1,last);

        System.out.println(soyad);

    }

}
