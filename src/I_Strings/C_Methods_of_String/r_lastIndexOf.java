package I_Strings.C_Methods_of_String;

public class r_lastIndexOf {
    public static void main(String[] args) {
        String str = "banana";
        System.out.println(str.lastIndexOf("na")); // Output: 4

        String filePath = "C:\\Users\\Documents\\myFile.java";
        int lastIndexOfDot =filePath.lastIndexOf(".");
        //  "//" is treated as a single character.
        System.out.println("The last dot is at index: " + lastIndexOfDot);
    }
}
