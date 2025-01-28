import java.util.Scanner;

public class SwapVariables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two variables
        System.out.print("Enter the first variable (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter the second variable (b): ");
        int b = scanner.nextInt();

        // Display initial values
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swap using a third variable
        int temp = a;
        a = b;
        b = temp; // Intentional error: Should be b = temp

        // Display swapped values
        System.out.println("After swapping: a = " + a + ", b = " + b);

        scanner.close();
    }
}

