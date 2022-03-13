package StringPack;

import java.util.Scanner;

public class StringTask6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("soz daxil edin");
        String soz = sc.nextLine();

        int say = 0;

        for(int i = 0;i<=soz.length()-1;i++){

            if (soz.charAt(i) == 'a'||soz.charAt(i) == 'e'||soz.charAt(i) == 'i'){
                say++;
            }
        }

        System.out.println(say);


    }
}
