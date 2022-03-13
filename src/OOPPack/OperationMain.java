package OOPPack;

public class OperationMain {

    public static void main(String[] args) {

      /* Operations oper = new Operations();
       int netice =  oper.topla(45,32);
        System.out.println(netice);
        int netice2 = oper.topla(12,65,74);
        System.out.println(netice2);
        int netice3 = oper.topla("32","21");
        System.out.println(netice3);*/

      Mentiqi oper = new Operation();
      boolean netice = oper.tekCut(48);
        System.out.println(netice);

        Arifmetik oper1 = new Operation();
       int netice1 = oper1.topla(63,14);
        System.out.println(netice1);

    }


}
