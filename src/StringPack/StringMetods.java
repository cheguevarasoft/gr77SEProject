package StringPack;

public class StringMetods {

    public static void main(String[] args) {


        String name = "Farid";

       // System.out.println(name.length());

         char herf = name.charAt(name.length()-1);
       //  System.out.println(herf);

         String metn = "Qarabag Azerbaycanin erazisidir";
          boolean result = metn.endsWith("r");
       //   System.out.println(result);


          boolean result1 = metn.startsWith("Qo");
          //System.out.println(result1);


          String a = "alma";
          String b = "Alma";
          int result2 = a.compareTo(b);
      //    System.out.println(result2);
        int result3 = a.compareToIgnoreCase(b);
        //  System.out.println(result3);


          boolean result4 = a.equals(b);
         // System.out.println(result4);
          boolean result5 = a.equalsIgnoreCase(b);
         // System.out.println(result5);


          String ad = "Qafqaz Abbasov";
          int index = ad.indexOf("a",5);
          //System.out.println(index);



          int lindex = ad.lastIndexOf("");
         // System.out.println(lindex);


         // System.out.println(ad.toUpperCase());
         // System.out.println(ad.toLowerCase());
         // System.out.println(ad.trim());
         // System.out.println(ad.substring(2));
        //  System.out.println(ad.substring(7,9));
       // System.out.println(ad.replace('a','o'));
        //  System.out.println(ad.replace("af","kj"));
         // System.out.println(ad.subSequence(0,4));

        String cumle = "kjhk@trter@fdgdf@fgdfg";
           String[] sozler = cumle.split("@");

        System.out.println(sozler[1]);

        System.out.println("-------------");
        for(String soz : sozler){

            System.out.println(soz);
        }


    }
}
