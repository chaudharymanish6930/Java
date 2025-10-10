package I_Strings.F_Regex_RegularExpersion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.*;

public class a_PatternMatcher {
    public static void main(String[] args) {
        String text = "My phone number is 9876543210";

        // Define regex pattern to find digits
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Found number: " + matcher.group());
        }
    }
}
