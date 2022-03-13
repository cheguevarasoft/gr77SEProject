package randompack;

import java.util.Random;

public class RandomTask1 {

    public static void main(String[] args) {

        String[] adlar = new String[5];
        adlar[0] = "Saida";
        adlar[1] = "Rashad";
        adlar[2] = "Elgun";
        adlar[3] = "Ilkin";
        adlar[4] = "Gular";

        Random rd = new Random();
        int index = rd.nextInt(adlar.length);
        System.out.println(adlar[index]);

    }
}
