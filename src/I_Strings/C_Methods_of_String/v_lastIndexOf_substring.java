package I_Strings.C_Methods_of_String;

public class v_lastIndexOf_substring {
    public static void main(String[] args) {
        String text = "This is a simple example.";

        String s=text.substring(text.lastIndexOf(" "));
        System.out.println("The last word is: "+s);
    }
}
