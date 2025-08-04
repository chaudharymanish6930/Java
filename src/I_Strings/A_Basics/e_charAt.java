package I_Strings.A_Basics;

public class e_charAt {
    public static void main(String[]args) {
        String lastname = "choudhary";
        System.out.println(lastname.length());

        for(int i=1;i<=lastname.length();i++){
            System.out.println(lastname.charAt(i));
        }
    }
}
