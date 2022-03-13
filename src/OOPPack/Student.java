package OOPPack;

public class Student {

   private String name;
   private String surname;
   private int id;
   private boolean active;

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.toUpperCase();
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname.toUpperCase();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = Math.abs(id);
    }

    Student(){

    }

    Student(String name,String surname,int id,boolean active){

        this.name = name;
        this.surname = surname;
        this.id = id;
        this.active = active;
    }

    void printData(){

        if(this.active==true){

            System.out.println("Adi : "+this.name+" Soyadi : "+this.surname + " Kodu : "+this.id+ " aktivdirmi : "+this.active);
        }


    }




}
