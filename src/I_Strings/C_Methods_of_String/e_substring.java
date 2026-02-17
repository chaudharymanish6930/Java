package I_Strings.C_Methods_of_String;

public class e_substring {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println("Substring(1, 4): " + str.substring(1, 4)); // Output: ell

        String date = "2025-03-11";
        String year = date.substring(0, 4);
        System.out.println("Year: " + year);

        String productDescription = "Laptop HP Pavilion";
        System.out.println(productDescription.substring(7,9)); // HP
    }
}
