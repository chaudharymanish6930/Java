package M_OOPs_in_Java.C_inheritance.C_AccessMethods;

public class a_PrivateMethods {
    class parents{
        String name;
        private void name(String n){

        }
    }
    class children extends parents{
        parents p1 = new parents();
        p1.name("Manish");
    }
    public static void main(String[] args) {

    }
}
