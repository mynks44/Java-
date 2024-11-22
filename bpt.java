abstract class Test {
    private static int reportCounter = 0;    protected int reportNumber;
    protected String doctor;

    public Test(String doctor) {
        this.doctor = doctor;
        this.reportNumber = reportCounter++;
    }

    public abstract String formatReport();
}

class BloodPressureTest extends Test {
    private final int systolicPressure;
    private final int diastolicPressure;
    private final int pulse
    ;

    public BloodPressureTest(String doctor, int systolicPressure, int diastolicPressure, int pulse) {
        super(doctor); 
        this.systolicPressure = systolicPressure;
        this.diastolicPressure = diastolicPressure;
        this.pulse = pulse;
    }

    @Override
    public String formatReport() {
        return String.format(
            "BP Report : Report Number: %d - Doctor: %s - Test Result: %d/%d Pulse: %d",
            reportNumber, doctor, systolicPressure, diastolicPressure, pulse
        );
    }
}

class Patient {
    private final String name;
    private final int PNumber;
    private BloodPressureTest bloodPressureTest;

    public Patient(String name, int PNumber) {
        this.name = name;
        this.PNumber = PNumber;
    }

    public void addBloodPressureTest(BloodPressureTest bloodPressureTest) {
        this.bloodPressureTest = bloodPressureTest;
    }

    public void printPatientReport() {
        System.out.printf("Patient: %s%nPatient Number: %d%n", name, PNumber);
        if (bloodPressureTest != null) {
            System.out.println(bloodPressureTest.formatReport());
        } else {
            System.out.println("No blood pressure test available.");
        }
    }
}

public class bpt {
    public static void main(String[] args) {
        Patient patient1 = new Patient("Rich", 123);
        Patient patient2 = new Patient("Webeer", 345);

        BloodPressureTest test1 = new BloodPressureTest("Dr Fever", 120, 80, 60);
        BloodPressureTest test2 = new BloodPressureTest("Dr Doom", 199, 102, 99);

        patient1.addBloodPressureTest(test1);
        patient2.addBloodPressureTest(test2);

        patient1.printPatientReport();
        System.out.println(); 
        patient2.printPatientReport();
    }
}
