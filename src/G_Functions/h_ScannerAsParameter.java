package G_Functions;
import java.util.Scanner;

public class h_ScannerAsParameter {
        public void utility(Scanner scn) {
            String a = scn.nextLine();
            String b = scn.nextLine();

            System.out.println(a + " " + b);
        }

        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);

            h_ScannerAsParameter obj = new h_ScannerAsParameter();
            obj.utility(scn);

            scn.close();
        }
}
