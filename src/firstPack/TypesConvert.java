package firstPack;

public class TypesConvert {

    public static void main(String[] args) {

        String a = "45";
        int b = Integer.valueOf(a);
        System.out.println(b);

        int d = 80;
        String f = String.valueOf(d);
        System.out.println(f);


        int a1 = 456;
        double d1 = a1;
        System.out.println(d1);

        char c2 = 'A';
        int a2 = c2;
        System.out.println(a2);

        double d3 = 52.3;
        int a3 = (int)d3;
        System.out.println(a3);


        int a4 = 76;
        char c4 = (char)a4;
        System.out.println(c4);


    }
}
