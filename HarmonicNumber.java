import java.util.Scanner;

public class HarmonicNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Harmonic Value (N): ");
        int N = scanner.nextInt();

        if (N <= 0) {
            System.out.println("N should be a non-zero positive integer.");
            return;
        }

        double harmonicValue = 0.0;
        for (int i = 1; i <= N; i++) {
            harmonicValue += 1.0 / i;
        }

        System.out.println("The " + N + "th Harmonic Value is: " + harmonicValue);

        scanner.close();
    }
}
