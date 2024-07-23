public class Manager extends Employee {
    public Manager(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Manager " + getName() + " is managing the team.");
    }
}
