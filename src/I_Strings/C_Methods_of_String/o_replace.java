package I_Strings.C_Methods_of_String;

public class o_replace {
    public static void main(String[] args) {
        String str = "java";
        System.out.println(str.replace('a', 'o')); // Output: jovo

        String phoneNumber = "987-654-3210";
        String formattedNumber = phoneNumber.replace('-', ' ');
        System.out.println("Original Phone Number: " + phoneNumber);
        System.out.println("Formatted Phone Number: " + formattedNumber);


        String secretMessage = "Access Denied. Try Again!";

        // Encrypt the message by replacing characters with codes
        String encryptedMessage=secretMessage;
        encryptedMessage=encryptedMessage.replace('A','@');
        encryptedMessage=encryptedMessage.replace('a','6');
        encryptedMessage=encryptedMessage.replace('e','3');
        encryptedMessage=encryptedMessage.replace('i','!');

        System.out.println("Original Message: [" + secretMessage + "]");
        System.out.println("Encrypted Message: [" + encryptedMessage + "]");

    }
}
