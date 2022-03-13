package ArraysPack;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayCls4 {

    public static void main(String[] args) {

        int cutcem = 0;
        int cutsay = 0;
        int tekcem = 0;
        int teksay = 0;

        int[] ededler = new int[6];
        ededler[0] = 85;
        ededler[1] = 70;
        ededler[2] = 88;
        ededler[3] = 90;
        ededler[4] = 97;
        ededler[5] = 16;


        for(int i = 0;i<=ededler.length-1;i++){

            if (ededler[i]%2==0){

                cutcem +=ededler[i];
                cutsay++;

            }else{
                tekcem+=ededler[i];
                teksay++;
            }

        }

        System.out.println(cutcem);
        System.out.println(cutsay);
        System.out.println(tekcem);
        System.out.println(teksay);

    }
}
