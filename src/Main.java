import model.Doctor;
import model.ISchedulable;
import model.Patient;
import model.User;

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


        User user = new Doctor("Maria Alejandra Contrich", "MaleCOntrich@gmail.com");
        user.showDataUser();
        
        User userPa = new Patient("Contrich", "COntrich@gmail.com");
        userPa.showDataUser();

        // clases anonimas
        // desde donde instancio le doy el comportamiento que necesito
        // a los metodos abstractos


        User user1 = new User("Johnsi", "john@gmail.com") {
            @Override
            public void showDataUser(){
                System.out.println("DOCTOR");
                System.out.println("Hospital: Cruz Morada");
                System.out.println("Geriatria");
            }      
        };

        user1.showDataUser();

        ISchedulable iSchedulable = new ISchedulable() {

            @Override
            public void schedule(String date, String time) {
                // TODO Auto-generated method stub
                
            }
            
        };


/*          System.out.println(myDoctor.name);
        System.err.println(myDoctor.speciality); */

/*         Patient patient = new Patient("Alejandra", "Alejandra@email.com");
        patient.setPhoneNumber("123456789"); 

        System.out.println(patient); */

    }
}

