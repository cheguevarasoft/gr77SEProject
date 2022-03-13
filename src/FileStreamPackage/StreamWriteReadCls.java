package FileStreamPackage;

import java.io.*;

public class StreamWriteReadCls {


    public static void main(String[] args) {

       // fileYaz();

       fileOxu();

    }

    private static void fileOxu() {

        DataInputStream datainput = null;

        try {
            datainput = new DataInputStream(new BufferedInputStream(new FileInputStream("telebe.dat")));

            boolean endfile = false;

            while(!endfile){
                try{

                    int id = datainput.readInt();
                    String name = datainput.readUTF();
                    String surname = datainput.readUTF();

                    Student stud = new Student(id,name,surname);
                    System.out.println(stud);

                }catch (EOFException e){

                    System.out.println("faylin axiri");
                    endfile = true;
                } catch (IOException e) {
                    e.printStackTrace();
                }


            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

    private static void fileYaz() {

        Student stud1 = new Student(100,"Rovshan","Murselli");
        Student stud2 = new Student(101,"Ravan","Seyfulla");

        DataOutputStream dataout = null;

        try {
            dataout = new DataOutputStream(new BufferedOutputStream( new FileOutputStream("telebe.dat")));

            dataout.writeInt(stud1.id);
            dataout.writeUTF(stud1.name);
            dataout.writeUTF(stud1.surname);

            dataout.writeInt(stud2.id);
            dataout.writeUTF(stud2.name);
            dataout.writeUTF(stud2.surname);



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(dataout!=null){
                try {
                    dataout.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }


}
