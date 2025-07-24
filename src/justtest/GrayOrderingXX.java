package justtest;
import java.util.Scanner;
public class GrayOrderingXX {

// ReverseFormsXX.java
// COSC 2425
// Program Set 1 - Problem 2
// References: Help Sheet snippet and Java's built-in string tools
    // Replace XX with your initials
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            char again;

            do {
                System.out.print("Enter Value: ");
                long num = input.nextLong();

                // Step 1: Convert to binary
                String binary = Long.toBinaryString(num);

                // Step 2: Remove leading zeros manually
                int index = 0;
                while (index < binary.length() && binary.charAt(index) == '0') {
                    index++;
                }
                String trimmedBinary = binary.substring(index);

                // Step 3: Reverse the trimmed binary
                StringBuilder reversedTrimmedBinary = new StringBuilder(trimmedBinary).reverse();

                // Step 4: Convert reversed binary to decimal
                long reversedDecimal = Long.parseLong(reversedTrimmedBinary.toString(), 2);

                // Step 5: Output results
                System.out.println("Reverse Decimal: " + reversedDecimal);
                System.out.println("Reverse Binary form with no 0s: " + reversedTrimmedBinary);

                // Step 6: Ask user to continue
                System.out.print("Run Again (Y/N): ");
                again = input.next().charAt(0);

            } while (again == 'Y' || again == 'y');

            input.close();
        }
    }
