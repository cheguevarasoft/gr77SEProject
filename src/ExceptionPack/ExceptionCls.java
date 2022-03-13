package ExceptionPack;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionCls {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ededi daxil edin");
        try{

            int a = sc.nextInt()/0;
            System.out.println(a);

        }catch(ArithmeticException ex){
            System.out.println(ex);
            return;
        }
        catch(InputMismatchException ex){
            System.out.println(ex);

        }finally {
            System.out.println("Elgun Abushov");
        }



        System.out.println("Ilkin Kerimov");

    }
}
