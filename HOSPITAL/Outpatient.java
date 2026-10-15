package Hospital;

import javax.naming.Name;

public class Outpatient extends Patient {

    double labCharge;

    public Outpatient(String name, double consultFee, double labCharge) {
        super(name, consultFee);
        this.labCharge = labCharge;
    }

    public double CalculateBill() {
        return labCharge + consultFee;
    }

    @Override

    public void Display() {

        System.out.println("Outpatient Information");

        System.out.println("Patient Name: " + Name);

        System.out.println("Consultation Fee: " + consultFee);

        System.out.println("Lab Charge: " + labCharge);

    }
}






