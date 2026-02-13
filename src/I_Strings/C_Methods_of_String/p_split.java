package I_Strings.C_Methods_of_String;

public class p_split {
    public static void main(String[] args) {
        String str = "a,b,c";
        String[] parts = str.split(",");
        System.out.println(parts);
        for (String part : parts) {
            System.out.print(part+" "); // Output: a \n b \n c
        }
    }
}
