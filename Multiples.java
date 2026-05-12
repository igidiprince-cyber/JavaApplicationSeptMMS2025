// Multiples

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.print("Enter first integer: ");
        num1 = input.nextInt();

        System.out.print("Enter second integer: ");
        num2 = input.nextInt();

        if (num1 % num2 == 0)
            System.out.println(num1 + " is a multiple of " + num2);

        else
            System.out.println(num1 + " is not a multiple of " + num2);
    }
}