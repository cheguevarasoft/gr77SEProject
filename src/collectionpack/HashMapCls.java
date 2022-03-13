package collectionpack;

import java.util.HashMap;

public class HashMapCls {

    public static void main(String[] args) {


        HashMap<Integer,String> seriyalar = new HashMap<Integer, String>();

        seriyalar.put(62,"Zaqatala");
        seriyalar.put(90,"Baku");
        seriyalar.put(50,"Sumqayit");
        seriyalar.put(20,"Ganca");
        seriyalar.put(null,"Naxchivan");


        System.out.println(seriyalar.get(90));
        System.out.println(seriyalar.get(null));
        System.out.println(seriyalar.isEmpty());
        System.out.println(seriyalar.containsKey(50));
        System.out.println(seriyalar.containsValue("Quba"));


      /*  for(Integer key : seriyalar.keySet()){

            System.out.println(key);
        }

       */
       /* for(String value : seriyalar.values()){

            System.out.println(value);
        }*/


    }
}
