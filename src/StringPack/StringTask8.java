package StringPack;

public class StringTask8 {

    public static void main(String[] args) {

        String metn = "kjhjkabghjabuyyguygabpoojpojpoopabkl";
        int say = 0;

       String[] massiv = metn.split("ab");

        say = massiv.length-1;

        System.out.println(say);
    }
}
