import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a new account (replace with actual user details)
        Account account = new Account("user123", "1234", 1000.0);
        ATM atm = new ATM(account);
        int option;

        // Prompt user for user id and user pin
        System.out.print("Enter User ID: ");
        String userId = scanner.nextLine();
        System.out.print("Enter User PIN: ");
        String userPin = scanner.nextLine();

        if (userId.equals(account.getUserId()) && userPin.equals(account.getUserPin())) {
            System.out.println("Login successful!");
            do {
                atm.displayMenu();
                System.out.print("Enter option: ");
                option = scanner.nextInt();
                scanner.nextLine();

                switch (option) {
                    case 1:
                        atm.transactionsHistory();
                        break;
                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        atm.withdraw(withdrawAmount);
                        break;
                    case 3:
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        atm.deposit(depositAmount);
                        break;
                    case 4:
                        System.out.print("Enter recipient ID: ");
                        String recipientId = scanner.nextLine();
                        System.out.print("Enter amount to transfer: ");
                        double transferAmount = scanner.nextDouble();
                        atm.transfer(recipientId, transferAmount);
                        break;
                    case 5:
                        System.out.println("Thank you for using our ATM. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                        break;
                }
            } while (option != 5);

            scanner.close();
        }
    }
}
