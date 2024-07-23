public class Developer extends Employee {
    public Developer(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Developer " + getName() + " is writing code.");
    }
}
 