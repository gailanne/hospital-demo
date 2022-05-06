package hospital;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NurseTest {
   Nurse underTest = new Nurse ("2", "name", 5);
   Patient sickPatient = new Patient();
   @Test
   public void shouldIncreaseHealthByFrom10To15WhenProvidingCare(){
      underTest.careForPatient(sickPatient);
      int healthLevel = sickPatient.getHealthLevel();
      assertEquals(15, healthLevel);
   }               //^^ expected result 15 For healthLevel

   @Test
   public void shouldDecreaseBloodLevelFrom10To15WheDrawingBlood(){
      underTest.drawBlood(sickPatient);
      int bloodLevel = sickPatient.getBloodLevel();
      assertEquals( 15,bloodLevel);

   }
   @Test
   public void shouldHaveASalaryOf60k(){
      int salary= underTest.calculatePay();
      assertEquals(60000, salary);
   }




}
