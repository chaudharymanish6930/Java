package C_Input_From_User;

public class h_even_or_odd_number {
    public static void main(String[] args){
        int n=5;
        int result =0;

        if(n%2==0){
            System.out.println("number is even");
            result =100;
        }
        else{
            System.out.println("number is odd");
            result =900;
        }
        System.out.println(result);
    }
}
