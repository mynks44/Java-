public abstract class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public abstract void performDuties();

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
