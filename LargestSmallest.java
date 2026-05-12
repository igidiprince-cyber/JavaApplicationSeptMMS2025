// Largest and Smallest of Five Integers

import java.util.Scanner;

public class LargestSmallest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number, largest, smallest;

        System.out.print("Enter integer 1: ");
        number = input.nextInt();

        largest = number;
        smallest = number;

        for (int i = 2; i <= 5; i++) {

            System.out.print("Enter integer " + i + ": ");
            number = input.nextInt();

            if (number > largest)
                largest = number;

            if (number < smallest)
                smallest = number;
        }

        System.out.println("Largest = " + largest);
        System.out.println("Smallest = " + smallest);
    }
}