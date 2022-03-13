package OOPPack2;

public class ProductMain {

    public static void main(String[] args) {

        Laptop lap = new Laptop();
        double result1 = lap.getTaxes(600);
        System.out.println(result1);

        Mobile mob = new Mobile();
       double result2 = mob.getTaxes(600);
        System.out.println(result2);

    }
}
