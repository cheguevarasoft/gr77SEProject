package OOPPack;

import java.util.Scanner;

public class MethodsCls3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("sozu daxil edin");

        String a = sc.next();

        Operations oper = new Operations();
        int cem = oper.kodCem(a);
        System.out.println(cem);

    }



}
