import model.Doctor;
import model.Patient;

public class Main {
    public static void main(String[] args) throws Exception {
/*         System.out.println("Hello, World!");
        Doctor myDoctor = new Doctor();
        myDoctor.name = "John Contreras";
        myDoctor.showName();
        myDoctor.showId();
        System.out.println(Doctor.id);

        Doctor myDoctorJohn = new Doctor();
        myDoctor.showId();
        System.out.println(Doctor.id); */

        //showMenu();
        
        Doctor myDoctor =  new Doctor ("John Contreras", "Cirujano");
        myDoctor.addAvailableAppointment( "21/01/22" , "9am");
        myDoctor.addAvailableAppointment( "21/01/22", "10am");
        myDoctor.addAvailableAppointment( "21/01/22", "1pm");
        System.out.println(myDoctor.getAvailableApointments());

        for (Doctor.AvailableApointment availableApointment: myDoctor.getAvailableApointments()) {
            System.out.println(availableApointment.getdate() +  " " + availableApointment.getId());
        }

/*          System.out.println(myDoctor.name);
        System.err.println(myDoctor.speciality); */

        Patient patient = new Patient("Alejandra", "Alejandra@email.com");
        patient.setPhoneNumber("123456789"); 

        System.out.println(patient);

    }
}

