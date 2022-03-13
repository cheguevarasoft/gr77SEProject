package OOPPack2;

public class Mobile extends Product {
    @Override
    double getTaxes(double amount) {
        double netice = amount*0.12;
        return  netice;
    }
}
