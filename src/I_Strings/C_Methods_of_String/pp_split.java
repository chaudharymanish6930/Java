package I_Strings.C_Methods_of_String;

public class pp_split {
    public static void main(String[] args) {
        String[] reviews = {
                "P1234:Great quality and fast delivery:5",
                "P5678:Poor packaging but good product:4",
                "P4321:Did not receive the item:1"
        };

        String[] parts1 = reviews[0].split(":"); // Complete the code

        System.out.println("Product ID: " + parts1[0]);
        System.out.println("Review: " + parts1[1]);
        System.out.println("Rating: " + parts1[2]);

        // Review 2
        String[] parts2 = reviews[1].split(":"); // Complete the code


        System.out.println("Product ID: "+parts2[0]);
        System.out.println("Review: "+parts2[1]);
        System.out.println("Rating: "+parts2[2]);

        // Review 3
        String[] parts3 = reviews[2].split(":");// Complete the code
        System.out.println("Product ID: "+parts3[0]);
        System.out.println("Review: "+parts3[1]);
        System.out.println("Rating: "+parts3[2]);

        System.out.println();
    }
}
