public class inclass2 {
    public static void main(String[] args) {
        int lines = 5;
        for (int i = 1; i <= lines; i++) {
            int x = 1;
            for (int j = 1; j <= i; j++) {
                x *= j;  
                System.out.print(j + " ");
            }
            System.out.print(x + "\n");  
        }

    }
}