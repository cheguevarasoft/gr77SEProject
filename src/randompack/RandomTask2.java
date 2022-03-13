package randompack;

import java.util.Random;

public class RandomTask2 {

    public static void main(String[] args) {

        String[] adlar = new String[5];
        adlar[0] = "Saida";
        adlar[1] = "Rashad";
        adlar[2] = "Elgun";
        adlar[3] = "Ilkin";
        adlar[4] = "Gular";

        Random rd = new Random();
        int index1 = 0;
        int index2 = 0;

        while(index1==index2){

            index1 = rd.nextInt(adlar.length);
            index2 = rd.nextInt(adlar.length);
        }


        String ad1 = adlar[index1];
        String ad2 = adlar[index2];

        System.out.println(ad1 + " - " + ad2);
    }
}
