import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Principal:");
        int principal = scanner.nextInt();

        System.out.println("Annual Interest Rate");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        System.out.println("Period (Years): ");
        byte years = scanner.nextByte();
        int numberOfPaymens = years * MONTHS_IN_YEAR;

        double mortgage = principal*(monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPaymens))/(Math.pow(1 + monthlyInterest, numberOfPaymens) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.print("Mortgage: " + mortgageFormatted);
    }
}
