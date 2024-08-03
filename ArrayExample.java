public class ArrayExample {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        
        System.out.println("Array elements:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        
        int key = 30;
        int index = search(arr, key);
        System.out.println("\nElement " + key + " found at index: " + index);
    }
    
    public static int search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1; // Element not found
    }
}
