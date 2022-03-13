package FileStreamPackage;

import java.io.*;

public class FileWriterReaderCls {

    public static void main(String[] args) {

       // fileYaz();
        fileOxu();

    }

    private static void fileOxu() {

        try(BufferedReader oxuyucu = new BufferedReader(new FileReader("Emekdashlar.txt"))){


            String metn;
            while((metn = oxuyucu.readLine())!=null){

                System.out.println(metn);
            }

        }catch (Exception e) {
            System.out.println(e);
        }

    }

    private static void fileYaz() {

        try(BufferedWriter yazici = new BufferedWriter(new BufferedWriter(new FileWriter("Emekdashlar.txt",true)))){


            yazici.write("Qafqaz");
            yazici.newLine();
            yazici.write("Abbasov");
            yazici.newLine();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
