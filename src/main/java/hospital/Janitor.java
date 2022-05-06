package hospital;

public class Janitor extends HospitalEmployee  {
    private boolean isCleaning;

    public Janitor(String employeeNumber, String name, String department, String isCleaning) {
        super(employeeNumber, name);
    }

    @Override
    public int calculatePay() {
        return 60000;
    }
}
