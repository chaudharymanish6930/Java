package I_Strings;

public class f_compareTo {
    public static void main(String[]args) {
        String firstname = "manish";
        String lastname = "manish";
        if(firstname.compareTo(lastname)==0){
            System.out.println("string is equal");
        }
        else {
            System.out.println("string is not equal");
        }
        // some case not allowed
        if(firstname == lastname){
            System.out.println("string is equal");
        }
        else {
            System.out.println("string is not equal");
        }
        // in non primative data type declaration
        if(new String("mony") ==  new String("mony")){
            System.out.println("string is equal");
        }
        else {
            System.out.println("string is not equal");
        }

    }
}
