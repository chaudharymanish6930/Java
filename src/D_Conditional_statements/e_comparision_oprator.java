package D_Conditional_statements;

import java.sql.SQLOutput;

public class e_comparision_oprator {
    public static void main(String[] args){
        int x =8;
        int y=7;
        int z=9;

        if(x>y && y<z){
            System.out.println("condition is true");
        }
        else if(y>x && y>z){
            System.out.println("false condition");
        }
        else{
            System.out.println("by default");
        }

    }
}
