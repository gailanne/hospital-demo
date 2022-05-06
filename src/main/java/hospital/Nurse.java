package hospital;

public class Nurse extends HospitalEmployee implements MedicalDuties{
    private int numPatients;

    public Nurse(String employeeNumber, String name, int numPatients) {
        super(employeeNumber, name);
        this.numPatients = numPatients;
    }
    @Override
    public void careForPatient(Patient sickPatient) {
        sickPatient.increaseHealthLevel(5);

    }
    @Override // overrride  bc now medical duties drives this
    public void drawBlood(Patient sickPatient) {
       sickPatient.decreaseBloodLevel(5);
    }

    @Override //overrride bc now hospempl drive this
    public int calculatePay() {
        return 60000;
    }
}
