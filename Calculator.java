import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Getting input from the  user.
        System.out.print("Enter first value: ");
        float a = scan.nextFloat();

        System.out.print("Enter second value: ");
        float b = scan.nextFloat();

        // Menu based operations.
        boolean exitNow = true;
        while (exitNow) { 
            System.out.println("Enter any operation.");
            System.out.println("1. Additon");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Exit");
            
            int choice = scan.nextInt();

        // Result calculation.
            float result = switch (choice) {
                case 1 -> a + b;
                case 2 -> a - b;
                case 3 -> a * b;
                case 4 -> a / b;
                case 5 -> a % b;
                case 6 -> { 
                    exitNow = false; 
                    yield 0; 
                }
                default -> { 
                    System.out.println("No such operation available. Please enter valid operation.");
                    yield 0;
                }
            };

            System.out.println("||================================================||");
            System.out.println("   The result for the choosen operation is: " + result);
            System.out.println("||================================================||");

        }
        scan.close();
    }
}
