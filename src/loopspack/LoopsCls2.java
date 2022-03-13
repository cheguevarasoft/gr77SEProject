package loopspack;

public class LoopsCls2 {

    public static void main(String[] args) {

        String netice = "";

        for (int i=0;i<=10;i++){

            System.out.println("Elgun");
            if (i==5){
               return;
            }
            netice = netice+i+" ";

        }
        System.out.println(netice);

        System.out.println("WellCome");
    }
}
