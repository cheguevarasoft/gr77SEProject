package collectionpack;

public class Mobile {

    String marka ;
    String model;
    int price;

    public Mobile(String marka, String model, int price) {
        this.marka = marka;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
