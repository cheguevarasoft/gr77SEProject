package StringPack;

import java.util.Scanner;

public class StringTask1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ad soyadi daxil edin");
        String adsoyad = sc.nextLine();

        String[] massiv = adsoyad.split(" ");

        String soyad = massiv[1];

        System.out.println("soyadi "+soyad);

    }


}
