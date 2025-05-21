package I_Strings;

public class g_substring {
    public static void main(String[]args){
        String sentence="My name is Manish";
        // String a=b.substring(begging,ending)
        String name= sentence.substring(11,sentence.length());
        System.out.println(name);  // Manish

        String name1= sentence.substring(0,12);
        System.out.println(name1);  // My anme is  M
    }
}
