package oops;



abstract class Clinic {

    String clinicName;
    String location;
    int beds;
    int staff;
    String year;

    public Clinic(String clinicName, String location, int beds, int staff, String year) {
        this.clinicName = clinicName;
        this.location = location;
        this.beds = beds;
        this.staff = staff;
        this.year = year;
    }

    abstract void showInfo();
    abstract void add();
    abstract void update();
    abstract void delete();
    abstract void fetch();
}

class Doctor extends Clinic {
    String specialty;
    int experience;
    String id;
    String shift;
    double salary;

    public Doctor(String clinicName, String location, int beds, int staff, String year,
                  String specialty, int experience, String id, String shift, double salary) {
        super(clinicName, location, beds, staff, year);
        this.specialty = specialty;
        this.experience = experience;
        this.id = id;
        this.shift = shift;
        this.salary = salary;
    }

    @Override
    void showInfo() {
        System.out.println("Doctor ID: " + id + ", Specialty: " + specialty + ", Experience: " + experience +
                " years, Shift: " + shift + ", Salary: " + salary);
    }

    @Override
    void add() { System.out.println("Doctor added."); }

    @Override
    void update() { System.out.println("Doctor updated."); }

    @Override
    void delete() { System.out.println("Doctor deleted."); }

    @Override
    void fetch() { System.out.println("Fetching doctors..."); }
}

class Patient extends Clinic {
    String patientId;
    int age;
    String illness;
    String admitDate;
    String dischargeDate;

    public Patient(String clinicName, String location, int beds, int staff, String year,
                   String patientId, int age, String illness, String admitDate, String dischargeDate) {
        super(clinicName, location, beds, staff, year);
        this.patientId = patientId;
        this.age = age;
        this.illness = illness;
        this.admitDate = admitDate;
        this.dischargeDate = dischargeDate;
    }

    @Override
    void showInfo() {
        System.out.println("Patient ID: " + patientId + ", Illness: " + illness + ", Age: " + age +
                ", Stay: " + admitDate + " to " + dischargeDate);
    }

    @Override
    void add() { System.out.println("Patient added."); }

    @Override
    void update() { System.out.println("Patient updated."); }

    @Override
    void delete() { System.out.println("Patient deleted."); }

    @Override
    void fetch() { System.out.println("Fetching patients..."); }
}

public class Main {
    public static void main(String[] args) {
        Doctor doc = new Doctor("City Clinic", "Mumbai", 50, 200, "1990", "Cardiology", 10, "D01", "Day", 75000);
        doc.showInfo();
        doc.add();

        Patient pat = new Patient("City Clinic", "Mumbai", 50, 200, "1990", "P01", 28, "Cold", "2025-02-10", "2025-02-15");
        pat.showInfo();
        pat.add();
    }
}
