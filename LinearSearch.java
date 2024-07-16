import java.util.Scanner;

public class LinearSearch {

    public static <T> int linearSearch(T[] arr, T key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        Integer[] arr = new Integer[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the number of keys to search for:");
        int k = scanner.nextInt();
        Integer[] keys = new Integer[k];

        System.out.println("Enter the keys to search for:");
        for (int i = 0; i < k; i++) {
            keys[i] = scanner.nextInt();
        }

        for (Integer key : keys) {
            int result = linearSearch(arr, key);
            if (result != -1) {
                System.out.printf("Key %d found at index: %d\n", key, result);
            } else {
                System.out.printf("Key %d not found in the array.\n", key);
            }
        }

        scanner.close();
    }
}
