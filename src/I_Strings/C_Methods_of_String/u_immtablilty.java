package I_Strings.C_Methods_of_String;

public class u_immtablilty {
    public static void main(String[] args){
        String originalMessage = "Java Programming";

        originalMessage.concat(" is fun!");

        String newMessage = originalMessage.concat(" is fun!");

        System.out.println("Original Message: " + originalMessage); // Output: Java Programming
        System.out.println("New Message: " + newMessage); // Output: Java Programming is fun!
    }
}
