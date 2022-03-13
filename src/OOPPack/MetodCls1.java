package OOPPack;

public class MetodCls1 {

    public static void main(String[] args) {

        int[] ededler = new int[3];
        ededler[0] = 45;
        ededler[1] = 64;
        ededler[2] = 77;

        Operations oper = new Operations();
       int cem =  oper.massivCem(ededler);

        System.out.println(cem);

    }



}
