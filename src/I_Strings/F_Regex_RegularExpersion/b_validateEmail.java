package I_Strings.F_Regex_RegularExpersion;

public class b_validateEmail {
    public static void main(String[] args) {
        String email = "manish@example.com";
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

        boolean isValid = email.matches(regex);
        System.out.println("Valid email? " + isValid);
    }
}
