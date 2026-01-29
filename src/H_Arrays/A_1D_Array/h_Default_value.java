package H_Arrays.A_1D_Array;

public class h_Default_value {
    public static void main(String[] args) {
        System.out.println("Integer Default value :");
        int[] a = new int[5];
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }

        System.out.println("Double default values :");
        double[] b = new double[5];
        for(int i=0; i<b.length; i++){
            System.out.println(b[i]);
        }

        System.out.println("Char default value :");
        char[] c = new char[5];
        for(int i=0; i<c.length; i++){
            System.out.println(c[i]);
        }

        System.out.println("Default String Value :");
        String[] s = new String[5];
        for(int i =0; i<s.length; i++){
            System.out.println(s[i]);
        }
    }
}
