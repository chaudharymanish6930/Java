package J_String_Builder;

public class g_reverse_print_of_a_string {
    public static void main(String[]args){
        StringBuilder a =new StringBuilder("Hello...");
        for(int i=0;i<a.length()/2;i++){
            int front=i;
            int back=a.length()-1-i; // 5-1-0=>4

            char frontchar=a.charAt(front);
            char backchar=a.charAt(back);

            a.setCharAt(front,backchar);
            a.setCharAt(back, frontchar);
        }
        System.out.println(a);
    }
}
