package hospital;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoctorTest {

   Doctor underTest = new Doctor("employeeNumber", "name", "specialty");
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
   public void shouldHaveASalaryOf90k(){
      int salary= underTest.calculatePay();
      assertEquals(90000, salary);
   }

}

