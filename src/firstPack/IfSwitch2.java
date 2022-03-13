package firstPack;

import java.util.Scanner;

public class IfSwitch2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("gunu daxil edin zehmet olmasa");
        int day = sc.nextInt();

        switch (day){
            case 1:
                System.out.println("Bazar ertesi");
                break;
            case 2:
            case 3:
                System.out.println("Chersenbe");
                break;
            case 4:
                System.out.println("Cume axshami");
                break;
            case 5:
                System.out.println("Cume");
                break;
            case 6:
                System.out.println("Shenbe");
                break;
            case 7:
                System.out.println("Bazar");
                break;
            default:
                System.out.println("bele gun yoxdur");
                break;
        }
    }

}
