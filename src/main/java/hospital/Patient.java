package hospital;

public class Patient {
    // need to set default levels for pvt int
    private int healthLevel;
    private int bloodLevel;


    public int getHealthLevel() {
        return healthLevel;
    }

    public int getBloodLevel() {
        return bloodLevel;
    }

    public void increaseHealthLevel(int healthIncreaseAmt) {
        healthLevel += healthIncreaseAmt;
    }

    public void decreaseBloodLevel(int bloodLevelDecreaseAmt) {
        bloodLevel -= bloodLevelDecreaseAmt;
    }

    //default constructor for a patient object
    // patient is a method this instance has "no constructors"
    public Patient() {
        bloodLevel = 20; // default blood level
        healthLevel = 10; //default patient health level
    }
    //overloaded constructor
    //this Patient is ALSO a method but since it has constructors it is "okay"
    //the information within the () is called a signature
    public Patient(int healthLevel, int bloodLevel) {
        this.healthLevel = healthLevel;
        this.bloodLevel = bloodLevel;
    }


}
