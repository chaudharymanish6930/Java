package I_Strings.B_Methods_of_String;

public class p_split_example {
    public static void main(String[] args) {
        String str = "a,b,c";
        String[] parts = str.split(",");
        for (String part : parts) {
            System.out.println(part); // Output: a \n b \n c
        }
    }
}
