package hospital;
//refactor->extract->interface care for sick patient and draw blood use implements to access
public interface MedicalDuties {
    //method call
    void careForPatient(Patient sickPatient)                      //class   object
    ;

    void drawBlood(Patient sickPatient);
}
