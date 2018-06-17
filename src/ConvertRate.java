import java.util.Scanner;

public class ConvertRate {
    public static void main(String[] args) {
        double rate;
        double USD;

        rate = 23000;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter USD: ");
        USD = sc.nextDouble();

        double VND = rate * USD;
        System.out.println("VND: " + VND);

    }
}
