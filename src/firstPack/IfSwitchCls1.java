package firstPack;

import java.util.Scanner;

public class IfSwitchCls1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("adi daxil edin");
        String ad = sc.nextLine();
        String soyad = "";


        if (ad.equals("Tural")){

            soyad = "Agazade";
        }
        else if (ad.equals("Ilkin")){

            soyad = "Karimov";
        }
        else if (ad.equals("Afaq")){

            soyad = "Aliyeva";
        }else{
            soyad = "bele ad yoxdur";
        }

        System.out.println(soyad);
    }
}
