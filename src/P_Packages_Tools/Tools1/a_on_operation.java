package P_Packages_Tools.Tools1;

import P_Packages_Tools.operations;

public class a_on_operation {
    public static void main(String[] args) {
        operations op1 = new operations();
        int x = op1.sum(12, 2);
        int y = op1.subs(7, 15);
        int z = op1.multi(10, 4);
        double w = op1.divi(100, 5);

        System.out.println(x+" "+y+" "+z+" "+w);

    }
}
