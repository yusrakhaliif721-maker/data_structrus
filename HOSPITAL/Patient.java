package Hospital;

public class Patient {
    String Name;
    double consultFee;

    public Patient(String name, double consultFee) {
        this.Name = name;
        this.consultFee = consultFee;
    }

    public void Display() {

        System.out.println("Patient Name: " + Name);

        System.out.println("Consultation Fee: " + consultFee);

        System.out.println("Total Bill: " + consultFee);
    }
}
