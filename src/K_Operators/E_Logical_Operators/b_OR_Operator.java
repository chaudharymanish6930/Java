package K_Operators.E_Logical_Operators;

public class b_OR_Operator {
    public static void main(String[] args) {
        boolean a = false;
        boolean b = true;

        boolean result = a || b; // true
        System.out.println(result);

        int age = 20;
        if(age < 18 || age > 60) { // true or flase -> true
            System.out.println("Not eligible");
        } else {
            System.out.println("Eligible");
        }
    }
}
