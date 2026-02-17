package I_Strings.I_Practice;

public class b_IntToString {
    public static void main(String[] args) {
        int a=1293;
        String s="";
        s+=a;
        System.out.println(s);

        System.out.println(Integer.toString(a));
        String p=Integer.toString(a);
        System.out.println(p);

        // String to Integer
        int n=Integer.parseInt(p);
        System.out.println(n);
    }
}
