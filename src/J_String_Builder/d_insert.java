package J_String_Builder;

public class d_insert {
    public static void main(String[]args){
        StringBuilder sb=new StringBuilder("Rohit Sharma");
        sb.insert(0,'M');
        System.out.println(sb); //MRohit Sharma

        sb.insert(2,'n');
        System.out.println(sb);  // MRnohit Sharma
    }
}
