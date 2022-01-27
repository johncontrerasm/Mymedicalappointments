package model;
import java.sql.Date;
import java.util.ArrayList;

public class Doctor extends User {
/*     static int id =0;
    String name;
    private String email;
    private String address;
    private String phoneNumber; */
    
    String speciality;

    

    // comportamientos

/*     Doctor (){
        System.out.println("Construyendo el objeto Doctor");
        
    } */

    public Doctor (String name, String email){
        super(name, email);
        System.out.println("El nombre del doctor asignado es " +name);
    }


    public String getSpeciality() {
        return this.speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }


/*     public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("ID Doctor: "+ id);
    }
 */
    ArrayList<AvailableApointment> availabeAppointments = new ArrayList<>();
    public void addAvailableAppointment (String date, String time){
        availabeAppointments.add(new Doctor.AvailableApointment(date, time));
    }

    public ArrayList<AvailableApointment> getAvailableApointments(){
        return availabeAppointments;
    }

    // clase independiente

    public static class AvailableApointment{
        private int id;
        private String date;
        private String time;

        public AvailableApointment(String date, String time) {
            this.date = date;
            this.time = time;
        }

        public int getId(){
            return id;
        }

        public void setId(int id){
            this.id = id;
        }

        public String getdate(){
            return this.date;
        }

    }

    @Override
    public void showDataUser() {
        // TODO Auto-generated method stub
        System.out.println("Empleado Hospital cruz Roja");
        System.out.println("Cancerologia");
        
    }


}
