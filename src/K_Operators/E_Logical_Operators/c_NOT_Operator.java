package K_Operators.E_Logical_Operators;

public class c_NOT_Operator {
    public static void main(String[] args) {
        boolean a = true;
        System.out.println(!a); // false

        int marks = 45;
        if(!(marks >= 50)) { // NOT operator
            System.out.println("Failed the exam");
        }
    }
}
