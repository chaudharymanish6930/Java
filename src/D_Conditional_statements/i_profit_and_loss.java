package D_Conditional_statements;

import java.util.Scanner;

public class i_profit_and_loss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cost Price :");
        int cp = sc.nextInt();
        System.out.print("Selling Price :");
        int sp = sc.nextInt();
        if(cp>sp){
            System.out.print("Loss :"+(cp-sp));
//            System.out.print(cp-sp);
        }
        else if(sp==cp){
            System.out.println("NO profit and No loss");
        }
        else{
            System.out.print("Profit :"+(sp-cp));
//            System.out.print(sp-cp);
        }
    }
}
