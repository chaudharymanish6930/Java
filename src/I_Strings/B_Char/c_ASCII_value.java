package I_Strings.B_Char;

public class c_ASCII_value {
        public static void main(String[] args) {
            String input = "abcde";  // Define the input string
            int total = 0;  // Initialize the total variable to zero

            System.out.println("Starting loop...");  // Print a message indicating the start of the loop

            // Loop through each character in the input string
            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);  // Get the current character
                System.out.println("Current character: " + ch);  // Print the current character

                total += ch;  // Add the ASCII value of the character to total

                System.out.println("Total so far (ASCII sum): " + total);  // Print running total
            }

            // After the loop finishes, print the final total
            System.out.println("Final total (ASCII sum): " + total);
        }
}
