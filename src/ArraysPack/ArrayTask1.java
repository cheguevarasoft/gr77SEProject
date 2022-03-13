package ArraysPack;

public class ArrayTask1 {

    public static void main(String[] args) {


        int[] ededler = new int[6];
        ededler[0] = 85;
        ededler[1] = 70;
        ededler[2] = 38;
        ededler[3] = 90;
        ededler[4] = 17;
        ededler[5] = 46;

        int min = ededler[0];
        int max = ededler[0];

        for(int i = 0;i<=ededler.length-1;i++){

            if (ededler[i]<min){

                min = ededler[i];
            }

            if(ededler[i]>max){
                max = ededler[i];
            }

        }

        System.out.println(min);
        System.out.println(max);


    }
}
