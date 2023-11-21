// Problem Statement:
// 5. Factors
// a. Desc -> Computes the prime factorization of N using brute force.
// b. I/P -> Number to find the prime factors
// c. Logic -> Traverse till i*i <= N instead of i <= N for efficiency.
// d. O/P -> Print the prime factors of number N.

import java.util.Scanner;

public class PrimeFactors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to find its prime factors: ");
        int N = scanner.nextInt();

        if (N <= 1) {
            System.out.println("Prime factorization is not applicable for numbers less than or equal to 1.");
            return;
        }

        System.out.println("Prime factors of " + N + " are:");
        computePrimeFactors(N);

    }

    public static void computePrimeFactors(int num) {
        while (num % 2 == 0) {
            System.out.print(2 + " ");
            num /= 2;
        }

        for (int i = 3; i * i <= num; i += 2) {
            while (num % i == 0) {
                System.out.print(i + " ");
                num /= i;
            }
        }

        if (num > 2) {
            System.out.print(num);
        }
    }
}
