package Hospital;

public class Main {

    public static void main(String[] args) {

        // Patient
        Patient p = new Patient("Rahma", 20.0);

        System.out.println("=== PATIENT ===");
        p.Display();

        System.out.println();

        // Outpatient
        Outpatient out = new Outpatient("Rahma", 20.0, 15.0);

        System.out.println("=== OUTPATIENT ===");
        System.out.println("Patient Name: " + out.Name);
        System.out.println("Consult Fee: " + out.consultFee);
        System.out.println("Lab Charge: " + out.labCharge);
        System.out.println("Total Bill: " + out.CalculateBill());

        System.out.println();

        // Inpatient
        Inpatient in = new Inpatient("Rahma", 30.0, 50.0, 3);

        System.out.println("=== INPATIENT ===");
        System.out.println("Patient Name: " + in.Name);
        System.out.println("Consult Fee: " + in.consultFee);
        System.out.println("Room Charge: " + in.roomCharge);
        System.out.println("Number Of Days: " + in.numberOfDays);
        System.out.println("Total Bill: " + in.CalculateBill());
    }
}
