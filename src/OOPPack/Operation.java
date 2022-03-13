package OOPPack;

public class Operation implements Mentiqi,Arifmetik {


    @Override
    public int topla(int a, int b) {
        int netice = a+b;
        return netice;
    }

    @Override
    public boolean tekCut(int deyer) {

        boolean netice = false;

        if (deyer%2==0){
            netice = true;
        }
        return netice;
    }
}
