public class Palindrome {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Palindrome <string>");
            return;
        }

        String input = args[0];
        
        String sanitizedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        Stack stack = new Stack(sanitizedInput.length());

        for (int i = 0; i < sanitizedInput.length(); i++) {
            stack.push(sanitizedInput.charAt(i));
        }

        StringBuilder reversedString = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }

        if (sanitizedInput.equals(reversedString.toString())) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}
