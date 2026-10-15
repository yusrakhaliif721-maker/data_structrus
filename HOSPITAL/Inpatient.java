package Hospital;

public class Inpatient extends Patient {


    double roomCharge;
    int numberOfDays;

    public Inpatient(String name, double consultFee,
                     double roomCharge, int numberOfDays) {

        super(name, consultFee);
        this.roomCharge = roomCharge;
        this.numberOfDays = numberOfDays;
    }

    public double CalculateBill() {
        return (numberOfDays * roomCharge) + consultFee;
    }

    @Override

    public void Display() {

        System.out.println("Inpatient Information");

        System.out.println("Patient Name: " + Name);

        System.out.println("Consultation Fee: " + consultFee);

        System.out.println("Room Charge per Day: " + roomCharge);

        System.out.println("Number of Days: " + numberOfDays);

        System.out.println("Total Bill: " + CalculateBill());
    }
}

