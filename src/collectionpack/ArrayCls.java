package collectionpack;

public class ArrayCls {

    public static void main(String[] args) {

        Mobile[] telefonlar = new Mobile[10];

        Mobile tel1 = new Mobile("ONE PLUS","6T",1100);
        Mobile tel2 = new Mobile("SAMSUNG","A30",470);
        Mobile tel3 = new Mobile("XIAMO","REDMI NOTE 7",450);

        telefonlar[0] = tel1;
        telefonlar[1] = tel2;
        telefonlar[2] = tel3;

        /*for (int i=0;i<=telefonlar.length-1;i++){
            System.out.println(telefonlar[i]);
        }*/

        for(Mobile mob : telefonlar ){

            System.out.println(mob);
        }

    }

}
