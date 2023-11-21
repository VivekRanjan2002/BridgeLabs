// Problem Statement:
// 1. Flip Coin and print percentage of Heads and Tails
// a. I/P -> The number of times to Flip Coin. Ensure it is a positive integer.
// b. Logic -> Use Random Function to get value between 0 and 1. If < 0.5 then tails or
// heads
// c. O/P -> Percentage of Head vs  Tails 

import java.util.Scanner;
import java.util.Random;

public class CoinFlip {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of flips : ");
        int Flips = sc.nextInt();

        if (Flips <= 0) {
            System.out.println("Total number of flips can't be negative.");
            return;
        }

        int heads = 0;
        int tails = 0;
        Random random = new Random();

        for (int i = 0; i < Flips; i++) {
            // Generate a random value between 0 and 1
            double randVal = random.nextDouble();

            // If the random value is less than 0.5, count it as tails, otherwise count as
            // heads
            if (randVal < 0.5) {
                tails++;
            } else {
                heads++;
            }
        }

        double headsPercent = (double) heads / Flips * 100;
        double tailsPercent = (double) tails / Flips * 100;

        System.out.println("Percentage of Heads: " + headsPercent + "%");
        System.out.println("Percentage of Tails: " + tailsPercent + "%");

    }
}
