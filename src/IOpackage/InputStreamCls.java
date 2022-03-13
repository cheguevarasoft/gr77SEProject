package IOpackage;

import java.io.*;

public class InputStreamCls {

    public static void main(String[] args) {

        fileYaz();
        fileOxu();

    }

    private static void fileOxu() {

        DataInputStream datainput = null;
        boolean endoffile = false;
        try {
            datainput = new DataInputStream(new BufferedInputStream(new FileInputStream("Students.dat")));
            Student stud1;

            while(!endoffile){

                try{

                    int id = datainput.readInt();
                    String name = datainput.readUTF();
                    String surname = datainput.readUTF();

                    stud1 = new Student(id,name,surname);
                    System.out.println(stud1);
                }catch(EOFException ex){

                    System.out.println("axira geldik");
                    endoffile = true;
                }

            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void fileYaz() {
        DataOutputStream dataout = null;
        Student stud1 = new Student(12,"Madina","Akhmadova");
        Student stud2 = new Student(14,"Surayya","Hajikhan");



            try {
                dataout = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("Students.dat")));

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
            } finally {
                if(dataout != null){
                    try {
                        dataout.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }


    }


}
