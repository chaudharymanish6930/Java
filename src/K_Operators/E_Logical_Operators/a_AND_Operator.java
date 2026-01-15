package K_Operators.E_Logical_Operators;

public class a_AND_Operator {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        boolean result = a && b; // false
        System.out.println(result);

        int x = 10;
        int y = 5;

        if(x > 0 && y > 0) { // true
            System.out.println("Both numbers are positive");
        }
    }
}
