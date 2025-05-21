package M_OOPs_in_Java.I_final_keyword;
public class d_FinalParameter {
        void show(final int value) {
                System.out.println("Final parameter value: " + value);
                // value = 50;  // ❌ Error: Cannot assign a value to final parameter
        }

        public static void main(String[] args) {
                d_FinalParameter obj = new d_FinalParameter();
                obj.show(25);
        }
}

