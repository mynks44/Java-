public class Designer extends Employee {
    public Designer(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Designer " + getName() + " is creating designs.");
    }
}
