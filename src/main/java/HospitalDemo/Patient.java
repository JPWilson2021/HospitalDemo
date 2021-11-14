package HospitalDemo;

public class Patient {

    private int healthLevel;
    private int bloodLevel;


    public int getBloodLevel() {
        return bloodLevel;
    }

    public int getHealthLevel() {
        return healthLevel;
    }



    // default constructor for a patient object

    public Patient() { //what goes inside parentheses is the signature
        healthLevel = 10; //default patient health level
        bloodLevel = 20; //default patient blood level

    }
    //overloaded constructor duplicate references as long as signatures are diff
    public Patient(int healthLevel, int bloodLevel) {
        this.healthLevel = healthLevel;
        this.bloodLevel = bloodLevel;

    }

    public void increaseHealthLevel(int healthIncreaseAmount) {
        healthLevel += healthIncreaseAmount;
    }

    public void decreaseBloodLevel(int bloodDecreaseAmount) {
        bloodLevel -= bloodDecreaseAmount;
    }
}

