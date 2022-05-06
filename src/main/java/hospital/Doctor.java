package hospital;

public class Doctor extends HospitalEmployee implements MedicalDuties {
    private String specialty;

    public Doctor(String employeeNumber, String name, String specialty) {
        super(employeeNumber, name);
        this.specialty = specialty;


    }

    //method call
    @Override
    public void careForPatient(Patient sickPatient) {
        sickPatient.increaseHealthLevel(10);

    }                      //class   object

    @Override
    public void drawBlood(Patient sickPatient) {
        //object   method in Patient-class    int in Patient Class
        sickPatient.decreaseBloodLevel(5);

    }

    @Override
    public int calculatePay() {
        return 90000;
    }




}
