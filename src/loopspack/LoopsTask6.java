package loopspack;

public class LoopsTask6 {

    public static void main(String[] args) {

        String netice = "";


        int say = 0;
        for(int i = 1;i<=4;i++){

            for(int j = 1;j<=i;j++){

                netice += say;

                say++;

            }

            netice+="\n";

        }

        System.out.println(netice);
    }
}
