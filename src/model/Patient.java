package model;
public class Patient extends User{
/*     int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber; */
    private String birthday;    
    private double weight;
    private double height;
    private String blood;


    public Patient(String name, String email){
        super(name, email);        
    }


    public void setPhoneNumber(String phoneNumber) {

    }

    public String getBirthday() {
        return this.birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getWeight() {
        return this.weight + " Kg.";
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return this.height + " Mts";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBlood() {
        return this.blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    @Override
    public String toString() {
        
        return super.toString() + "\nAge: "+birthday + "\n Weithg " +getWeight() + "\n Height "+getHeight()+ " \nBlood "+blood;
    }


    @Override
    public void showDataUser() {
        // TODO Auto-generated method stub
        System.out.println("Paciente");
        System.out.println("Historial completo desde nacimiento");
        
    }



    
}
