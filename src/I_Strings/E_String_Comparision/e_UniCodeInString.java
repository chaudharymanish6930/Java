package I_Strings.E_String_Comparision;

public class e_UniCodeInString {
    public static void main(String[] args) {
        // Normal ASCII space (u0020)
        String normalSpace = "  Hello World  ";

        // Unicode non-breaking space (u00A0)
        String unicodeSpace = "\u00A0Hello World\u00A0";

        // Print them with brackets to see where spaces exist
        System.out.println("Before trim:");
        System.out.println("normalSpace = [" + normalSpace + "]");
        System.out.println("unicodeSpace = [" + unicodeSpace + "]");

        // Apply trim() and strip()
        System.out.println("\nAfter trim():");
        System.out.println("normalSpace.trim()  = [" + normalSpace.trim() + "]");
        System.out.println("unicodeSpace.trim() = [" + unicodeSpace.trim() + "]");

        System.out.println("\nAfter strip():");
        System.out.println("normalSpace.strip()  = [" + normalSpace.strip() + "]");
        System.out.println("unicodeSpace.strip() = [" + unicodeSpace.strip() + "]");
    }
}