package I_Strings.I_Practice;
import java.util.*;

public class g_ComparisonString {
    public static void main(String[] args) {

        String sub = "567";
        String ans = "345";

        // Check which number is larger
        if (sub.length() > ans.length() ||
                (sub.length() == ans.length() && sub.compareTo(ans) > 0)) {

            System.out.println(sub + " is larger.");
        } else {
            System.out.println(ans + " is larger or equal.");
        }
    }
}
