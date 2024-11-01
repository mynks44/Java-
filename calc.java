public class calc {
    private double total;
    private int password;
    private boolean locked = true;
    public calc(int password) {
        this.password = password;
        this.total = 0.0;
    }
    public void unlock(int password) {
        if (this.password == password) {
            locked = false;
        }
    }
    public void lock() {
        locked = true;
    }
    public boolean add(double number) {
        if (!locked) {
            total += number;
            return true;
        }
        return false;
    }
    public boolean subtract(double number) {
        if (!locked) {
            total -= number;
            return true;
        }
        return false;
    }
    public boolean multiply(double number) {
        if (!locked) {
            total *= number;
            return true;
        }
        return false;
    }
    public boolean divide(double number) {
        if (!locked && number != 0) {
            total /= number;
            return true;
        }
        return false;
    }
    public void clearTotal() {
        if (!locked) {
            total = 0;
        }
    }
    public String toString() {
        return "Total: " + total;
    }
    public void printOutModelType() {
        System.out.println("Basic Calculator");
    }
    public double getTotal() {
        return total;
    }
}
class DeluxeCalc extends calc {
    private double memory;
    public DeluxeCalc(int password) {
        super(password);
        memory = 0.0;
    }
    public void clearMemory() {
        memory = 0;
    }
    public void addToMemory() {
        memory += getTotal();
    }
    @Override
    public void printOutModelType() {
        System.out.println("Deluxe Calculator");
    }
    @Override
    public String toString() {
        return "Total: " + getTotal() + ", Memory: " + memory;
    }
}

