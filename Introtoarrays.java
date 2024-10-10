
import javax.swing.JOptionPane;

public class Introtoarrays {

    public static void main(String[] args) {
        int[] marksarr = new int[5]; // declare and initialize an integer array of size 5
        
        marksarr[1] = 66;
        marksarr[2] = 77;
        marksarr[3] = 88;
        marksarr[4] = 99;
        
        System.out.println("element at index 1 is " + marksarr[1]);
        System.out.println("size of array is " + marksarr.length);
        
        double[] doublearr = new double[15];
        
        for (int i = 0; i < 15; i++) {
            doublearr[i] = Double.parseDouble(JOptionPane.showInputDialog(marksarr));
        }
        
        for (int i = 0; i < 15; i++) {
            System.out.println("Value at index " + i + " is " + doublearr[i]);
        }
    }
}