package OOPPack;

public class Operations {


    static int massivCem(int[] array){

        int netice = 0;

        for(int i = 0;i<=array.length-1;i++){

            netice+=array[i];
        }

        return  netice;
    }

    static int kodCem(String soz){

        int netice = 0;

        for (int i = 0;i<=soz.length()-1;i++){

            int kod = soz.charAt(i);
            netice+=kod;
        }
        return  netice;
    }

    int topla(int a,int b){

        int result = a+b;
        return  result;
    }

    int topla(int a,int b, int c){

        int result = a+b+c;
        return  result;
    }

    int topla(String a,String b){

        int result = Integer.valueOf(a)+ Integer.valueOf(b);
        return  result;
    }
}
