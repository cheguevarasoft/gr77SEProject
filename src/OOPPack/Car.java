package OOPPack;

public class Car {

   private String marca;
   private String model;
   private String color;
   private int speed;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    void start(){
        System.out.println("Car starting");
    }

    void stop(){

        System.out.println("Car stoping");
    }

}
