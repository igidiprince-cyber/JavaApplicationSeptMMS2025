// Negative, Positive and Zero

import java.util.Scanner;

public class NumberCounter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int i = 1; i <= 5; i++) {

            System.out.print("Enter number: ");
            number = input.nextInt();

            if (number > 0)
                positive++;

            if (number < 0)
                negative++;

            if (number == 0)
                zero++;
        }

        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
        System.out.println("Zeros: " + zero);
    }
}