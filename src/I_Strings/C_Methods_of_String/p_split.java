package I_Strings.C_Methods_of_String;

public class p_split {
    public static void main(String[] args) {
        String str = "a,b,c";
        String[] parts = str.split(",");
        System.out.println(parts);
        for (String part : parts) {
            System.out.print(part+" "); // Output: a \n b \n c
        }

        String sentence = "Java makes programming easier";
        String firstWord = sentence.split(" ")[0];  // First word
        String secondWord = sentence.split(" ")[1]; // Second word
        String thirdWord = sentence.split(" ")[2];  // Third word
        String fourthWord = sentence.split(" ")[3]; // Fourth word

        System.out.println("The first word in the sentence is: " + firstWord);
        System.out.println("The second word in the sentence is: " + secondWord);
        System.out.println("The third word in the sentence is: " + thirdWord);
        System.out.println("The fourth word in the sentence is: " + fourthWord);

        String logEntry = "12:30";
        String[] part=logEntry.split("[:;]");
        String timestamp = part[0];
        String minutes = part[1];
        System.out.println("Timestamp: " + timestamp);
        System.out.println("Minutes: " + minutes);
    }
}
