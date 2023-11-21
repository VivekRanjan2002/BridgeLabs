// Problem Statement:
// 2. Leap Year
// a. I/P -> Year, ensure it is a 4 digit number.
// b. Logic -> Determine if it is a Leap Year.
// c. O/P -> Print the year is a Leap Year or not.

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year (4 digits): ");
        int year = scanner.nextInt();

        if (year < 1000 || year > 9999) {
            System.out.println("Please enter a valid 4-digit year.");
        } else {
            boolean isLeapYear = false;

            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                isLeapYear = true;
            }

            if (isLeapYear) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        }

    }
}
