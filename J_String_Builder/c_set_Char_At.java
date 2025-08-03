package J_String_Builder;

public class c_set_Char_At {
    public static void main(String args[]){
        // set char at index
        StringBuilder ab=new StringBuilder("Manish");
        System.out.println(ab); // Manish
        ab.setCharAt(2,'M');
        System.out.println(ab); // MaMish
    }
}
