package collectionpack;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCls {

    public static void main(String[] args) {

        List<Mobile> telefonlar = new ArrayList<>();

        Mobile tel1 = new Mobile("ONE PLUS","6T",1100);
        Mobile tel2 = new Mobile("SAMSUNG","A30",470);
        Mobile tel3 = new Mobile("XIAMO","REDMI NOTE 7",450);

        telefonlar.add(tel1);
        telefonlar.add(tel2);
        telefonlar.add(tel3);

      Mobile tel4 = new Mobile("HONOR","NOTE 7",600);

        telefonlar.add(1,tel4);

       /* for(Mobile mob : telefonlar){
            System.out.println(mob);
        }*/

       // System.out.println(telefonlar.size());
      //  System.out.println(telefonlar.isEmpty());
       // telefonlar.clear();
      //  System.out.println(telefonlar.isEmpty());
        System.out.println(telefonlar.get(2));

    }

}
