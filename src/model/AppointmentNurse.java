package model;

public class AppointmentNurse implements ISchedulable {
    private int id;
    private Patient patient;
    private Doctor doctor;
    private String String;
    private String time;
    

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Patient getPatient() {
        return this.patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return this.doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getString() {
        return this.String;
    }

    public void setString(String String) {
        this.String = String;
    }

    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public void schedule(java.lang.String date, java.lang.String time) {
        // TODO Auto-generated method stub
        
    }

    
}
