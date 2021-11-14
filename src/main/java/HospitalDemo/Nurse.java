package HospitalDemo;

public class Nurse extends HospitalEmployee implements MedicalDuties {

    private int NumPatients;

    public Nurse(String employeeNumber, String name, int numPatients) {
        super(employeeNumber, name);
        this.NumPatients = numPatients;
    }

    @Override
    public void careForPatient(Patient sickPatient) {

        sickPatient.increaseHealthLevel(5);
    }

    @Override
    public void drawBlood(Patient sickPatient) {

        sickPatient.decreaseBloodLevel(5);
    }

    @Override
    public int calculatePay() {
        return 80000;
    }


}
