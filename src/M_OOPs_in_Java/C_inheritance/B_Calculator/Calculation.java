package M_OOPs_in_Java.C_inheritance.B_Calculator;

public class Calculation {
    public static void main(String[] args){

        // mutli-level inheritence
        VeryAdvCalc obj =new VeryAdvCalc();
        int r1 = obj.add(12,10);
        int r2 = obj.subs(30,18);
        int r3 = obj.multi(12,5);
        int r4 = obj.divi(15,5);
        double r5 = obj.power(2,5);
        System.out.println(r1+" "+r2+" "+r3+" "+r4+" "+r5);
    }
}
