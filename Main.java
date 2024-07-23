public class Main {
    public static void main(String[] args) {
        Employee dev = new Developer("Alice", 101);
        Employee mgr = new Manager("Bob", 102);
        Employee dsg = new Designer("Charlie", 103);

        // Array of employees
        Employee[] employees = {dev, mgr, dsg};

        // Demonstrate polymorphism
        for (Employee emp : employees) {
            emp.performDuties();
        }
    }
}
