// Problem Statement:
// 3. Power of 2
// a. Desc -> This program takes a command-line argument N and prints a table of the
// powers of 2 that are less than or equal to 2^N.
// b. I/P -> The Power Value N. Only works if 0 <= N < 31 since 2^31 overflows an int
// c. Logic -> repeat until i equals N.
// d.O/P->Print the year is a Leap Year or not.

public class PowerOfTwo {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide one integer argument.");
            return;
        }

        int N = Integer.parseInt(args[0]);

        if (N < 0 || N >= 31) {
            System.out.println("N should be in the range of 0 to 30 inclusive.");
            return;
        }

        System.out.println("Powers of 2 less than or equal to 2^" + N + ":");
        int power = 1;
        for (int i = 0; i <= N; i++) {
            System.out.println("2^" + i + " = " + power);
            power *= 2;
        }
    }
}
