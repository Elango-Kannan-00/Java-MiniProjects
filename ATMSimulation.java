import java.util.Scanner;

class ATMSimulation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double balanceAmount = 1000.00;

        boolean stopProcess = true;
        while (stopProcess) {
            System.out.println("========== Welcome to All India ATM ==========");
            System.out.println("1. Balance Check");
            System.out.println("2. Cash Withdrawal");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");
            System.out.println("==============================================");
            System.out.print("Choose an option: ");

            int option = scan.nextInt();

            switch (option) {
                case 1 -> System.out.println("Your balance: " + balanceAmount);

                case 2 -> {
                    System.out.print("Enter amount to withdraw: ");
                    double amount = scan.nextDouble();
                    if (amount <= 0) {
                        System.out.println("Please enter a valid amount.");
                    } else if (amount > balanceAmount) {
                        System.out.println("Insufficient balance!");
                    } else {
                        balanceAmount -= amount;
                        System.out.println("Withdrawal successful. New balance: " + balanceAmount);
                    }
                }

                case 3 -> {
                    System.out.print("Enter amount to deposit: ");
                    double amount = scan.nextDouble();
                    if (amount <= 0) {
                        System.out.println("Please enter a valid amount.");
                    } else {
                        balanceAmount += amount;
                        System.out.println("Deposit successful. New balance: " + balanceAmount);
                    }
                }

                case 4 -> {
                    stopProcess = false;
                    System.out.println("Thank you for using All India ATM. Goodbye!");
                }

                default -> System.out.println("No such operation.");
            }
        }

        scan.close();
    }
}
