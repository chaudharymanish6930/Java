package Q_Mini_Project;

import java.util.Scanner;
public class a_guess_number {
    public static void main(String[] args){
        int mynumber = (int)(Math.random()*100);

        Scanner scanner= new Scanner(System.in);
        int usernumber ;

        do{
            System.out.println("guess a number: ");
            usernumber = scanner.nextInt();

            if(mynumber == usernumber){
                System.out.println("nice guess...");
                break;
            }
            else if(mynumber < usernumber){
                System.out.println("Number is too large");
            }
            else{
                System.out.println("NUmber is too small");
            }
        } while(usernumber >= 0);
    }
}
