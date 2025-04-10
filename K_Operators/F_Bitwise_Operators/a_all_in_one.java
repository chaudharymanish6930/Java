package K_Operators.F_Bitwise_Operators;

public class a_all_in_one {
        public static void main(String[] args) {
            int a = 5;   // 0101
            int b = 3;   // 0011

            System.out.println("a & b: " + (a & b));  // AND
            System.out.println("a | b: " + (a | b));  // OR
            System.out.println("a ^ b: " + (a ^ b)); // XOR  SAME==0
            System.out.println("~a: " + (~a)); // ONE'S COMPLIMENT
            System.out.println("a << 1: " + (a << 1)); //  LEFT SHIFT
            System.out.println("a >> 1: " + (a >> 1)); // RIGHT SHIFT
        }
    }
