
public class Palindrome {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Pleaseeeeeeeeeeeeeeeeeee provide a single string as a command-line argument.");
            return;
        }

        String input = args[0];
        Stack stack = new Stack(input.length());
        
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }
        
        String reversedString = "";
        while (!stack.isEmpty()) {
            reversedString += stack.pop();
        }
        
        if (input.equals(reversedString)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}
