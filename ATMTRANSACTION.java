import java.util.Scanner;

public class ATMTRANSACTION {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

     
        int correctPin = 1234;
        int balance = 5000;
        int enteredPin;
        int choice;

        System.out.println("======================================");
        System.out.println("      WELCOME TO THE ATM SYSTEM       ");
        System.out.println("======================================");

        
    
        while (true) {
            System.out.print("Enter your 4-digit PIN: ");
            enteredPin = sc.nextInt();

            if (enteredPin == correctPin) {
                System.out.println("PIN Accepted! Access Granted.");
                break;
            } else {
                System.out.println("Incorrect PIN. Try again.");
            }
        }

        

       System.out.println("--- ATM MENU ---");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");

        System.out.print("Choose an option (1-4): ");
        choice = sc.nextInt();

        switch (choice) {
                 case 1:
                    System.out.println("Current Balance: " + balance);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    int depositAmount = sc.nextInt();
                    if (depositAmount > 0) {
                        balance = balance + depositAmount;
                        System.out.println("Deposit successful. New balance: " + balance);
                                            System.out.println("Thank you for using the ATM.");
                                            break;
                    } else {
                        System.out.println("Deposit amount must be positive.");
                    }
                    break;

                    case 3:
                    System.out.print("Enter amount to withdraw: ");
                    int withdrawAmount = sc.nextInt();
                    if (withdrawAmount > 0 && withdrawAmount <= balance) {
                        balance = balance - withdrawAmount;
                        System.out.println("Withdrawal successful. New balance: " + balance);
                                            System.out.println("Thank you for using the ATM.");
                                            break;
                    } else if (withdrawAmount > balance) {
                        System.out.println("Insufficient balance.");
                    } else {
                        System.out.println("Withdrawal amount must be positive.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM.");
                    break;

                default:
                    System.out.println("Invalid choice , Please select between 1 and 4 only.");
            }
        sc.close();
      
    }
}