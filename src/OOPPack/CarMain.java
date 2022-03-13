package OOPPack;

public class CarMain {

    public static void main(String[] args) {

        Car car1 = new Audi();
        car1.setMarca("Audi");
       // car1.start();
       // car1.stop();

        Car car2 = new Nissan();
        car2.setMarca("Nissan");
       // car2.start();
       // car2.stop();

        testCar(car2);


    }

    static  void testCar(Car data){

        System.out.println( data.getMarca() + " test Successful ");
    }



}
