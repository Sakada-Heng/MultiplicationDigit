package multiDigits;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

// Prompt user to use appropriate numbers
        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();

        // loop to multiply the digits
        int sum = 1;
        // loop until no longer able to remove the extracted digit
        while (number > 0) {
            // Extract last digit
            int digit = number % 10;
            sum *= digit;
            // Remove extracted digit
            number /= 10;
        }
        // Result
        System.out.println("The multiplication of all digit is " + sum);
        input.close();
    }
}
