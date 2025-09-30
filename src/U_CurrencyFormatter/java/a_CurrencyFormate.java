package U_CurrencyFormatter.java;

import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;

public class a_CurrencyFormate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // US currency
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("US: " + usFormat.format(payment));

        // India currency
        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(indiaLocale);
        System.out.println("India: " + indiaFormat.format(payment));

        // China currency
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.println("China: " + chinaFormat.format(payment));

        // France currency
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("France: " + franceFormat.format(payment));
    }
}
