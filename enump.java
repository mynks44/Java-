public class enump {

    public enum Elements {
        H("Hydrogen", 1, 1.008), Li("Lithium", 3, 6.941), Be("Beryllium", 4, 9.01218), 
        Na("sodium", 11, 22.9909), O("Oxygen", 8, 15.9994), 
        Mg("magnesium", 12, 24.305), Ne("Neon", 10, 20.1797);
        

        private String name;
        private int atomicNumber;
        private double atomicMass;

        Elements(String name, int atomicNumber, double atomicMass) {
            this.name = name;
            this.atomicNumber = atomicNumber;
            this.atomicMass = atomicMass;
        }

        public String getName() {
            return name;
        }

        public int getAtomicNumber() {
            return atomicNumber;
        }

        public double getAtomicMass() {
            return atomicMass;
        }
    }

    public static void main(String[] args) {
        Elements userVar = Elements.H;
        System.out.println("Name: " + userVar.getName());
        System.out.println("Atomic Number: " + userVar.getAtomicNumber());
        System.out.println("Atomic Mass: " + userVar.getAtomicMass());
    }
}