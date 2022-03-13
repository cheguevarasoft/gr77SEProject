package OOPPack2;

public class Laptop extends Product {
    @Override
    double getTaxes(double amount) {
        double netice = amount*0.1;
        return  netice;
    }
}
