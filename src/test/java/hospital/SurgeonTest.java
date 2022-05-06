package hospital;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SurgeonTest {
    Surgeon underTest = new Surgeon("1", "name", "specialty",true );
    Patient sickPatient = new Patient();
    @Test
    public void shouldIncreaseHealthLevelOfPatientWhenProvidingCare(){
        underTest.careForPatient(sickPatient);
        int patientHealthLevel = sickPatient.getHealthLevel();
        assertEquals(patientHealthLevel, 20);
    }
    @Test
    public void shouldDecreaseBloodLevelFrom10To15WheDrawingBlood(){
        underTest.drawBlood(sickPatient);
        int bloodLevel = sickPatient.getBloodLevel();
        assertEquals( 15,bloodLevel);

    }
    @Test
    public void shouldHaveASalaryOf100k(){
        int salary= underTest.calculatePay();
        assertEquals(100000, salary);
    }
}
