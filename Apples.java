public class Apples {
    public static void main(String[] args) {
        int totalapp = 680;
        int appleinbasket = 50;
        
        int fullbasket = totalapp / appleinbasket;
        
        int leftapple = totalapp % appleinbasket;
        
        System.out.println("We have " + totalapp + " apples.");
        System.out.println("Each basket can hold " + appleinbasket + " apples.");
        System.out.println("We can fill " + fullbasket + " full baskets.");
        System.out.println("There will be " + leftapple + " apples left over.");
    }
}
