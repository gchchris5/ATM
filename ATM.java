import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("You are about to create a new account. Continue by entering your name: ");
        String name = scan.nextLine();
        System.out.println("Now, create a pin for your account. Do not share this pin with anyone.");
        System.out.print("New PIN: ");
        int pin = scan.nextInt();

        Account a = new Account(name, pin);

        System.out.println("Your account has been created.");
        System.out.println("Would you like to deposit money into your account? YES(1) or NO(2)");
        if (scan.nextInt() == 1) {
            System.out.print("Deposit amount: ");
            double depositAmount = scan.nextDouble();
            a.setBalance(depositAmount);
            System.out.print(a.toString());
        }
        else {
            System.out.print("Invalid input, try again later.");
        }

    }
}
