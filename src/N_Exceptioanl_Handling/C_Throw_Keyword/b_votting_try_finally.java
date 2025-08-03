package N_Exceptioanl_Handling.C_Throw_Keyword;

import java.util.Scanner;

class AgeException1 extends RuntimeException{
     AgeException1(String message) {
        super(message);
    }
}

class b_votting_try_finally {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your age: ");
        int age= sc.nextInt();
        try{
            if(age<18){
                throw new AgeException1("not eligible...");
            }
            else{
                System.out.println("eligible for votting...");
            }
        }
        finally{
            System.out.println("you are successfully votted");
        }
    }
}
