package I_Strings.D_StringBuffer;

public class a_create_string_buffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Choudhary");

        System.out.println(sb.capacity());  // 16

        System.out.println(sb.length());    // 9

        sb.append(" Sahab");
        System.out.println(sb);

        sb.deleteCharAt(8);
        System.out.println(sb);

        sb.insert(8,'y');
        System.out.println(sb);

        sb.insert(0,"Manish ");
        System.out.println(sb);

    }
}
