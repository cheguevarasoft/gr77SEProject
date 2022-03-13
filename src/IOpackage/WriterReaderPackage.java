package IOpackage;

import java.io.*;

public class WriterReaderPackage {

    public static void main(String[] args) {

     //   writerYaz();

      //  writerYazOld();

        writerOxu();

    }

    private static void writerYazOld() {

        BufferedWriter yazici = null;

        try {

             yazici = new BufferedWriter( new BufferedWriter(new FileWriter("melumatlar.txt",true)));

            yazici.write("Ehtiram\n");
            yazici.write("Hajikhanov");

        } catch (IOException e) {
            e.printStackTrace();
        }finally {

            if(yazici!=null){
                try {
                    yazici.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }

    private static void writerOxu() {

        try(BufferedReader okuyucu = new BufferedReader(new FileReader("melumatlar.txt"))){

            String s;

            while((s = okuyucu.readLine()) != null){

                System.out.println(s);
            }


        }catch (Exception ex){

            System.out.println(ex);
        }



    }

    private static void writerYaz() {

        //BufferedWriter yazici = null;

        try( BufferedWriter yazici = new BufferedWriter( new BufferedWriter(new FileWriter("melumatlar.txt",true)))) {


            yazici.write("Ehtiram\n");
            yazici.write("Hajikhanov");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
