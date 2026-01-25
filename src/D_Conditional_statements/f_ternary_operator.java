package D_Conditional_statements;

public class f_ternary_operator {
    public static void main(String[] args){
        int n=5;
        int result =0;
//        if(n%2==0){
//            System.out.println("number is even");
//        }
//        else{
//            System.out.println("number is odd");
//        }
//        System.out.println(result);
        result = n%2==0 ? 10 : 20;
        System.out.println(result);

        // Using ternary operator to print in one line
        System.out.println("The number " + n + " is " + ((n % 2 == 0) ? "Even" : "Odd"));

        int a = 25, b = 40, c = 30;

        int greatest = (a > b)? (a > c ? a : c) : (b > c ? b : c);

        System.out.println("Greatest number is: " + greatest);
    }
}
