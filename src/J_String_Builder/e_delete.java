package J_String_Builder;

public class e_delete {
    public static void main(String[]args){
        StringBuilder sb=new StringBuilder("Rohit Sharma");
        sb.delete(0,5);
        System.out.println(sb); // _Sharma
    }
}
