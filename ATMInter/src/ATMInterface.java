import java.util.Scanner;

public class ATMInterface {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*****Welcome to SBI ATM*****");
        System.out.print("Please Enter Your Initial Account Balance : ");
        int initial=sc.nextInt();
        BankAccount account = new BankAccount();
        account.userBalance(initial);
        System.out.println("How can we Help You Today????");
        boolean exit = false;
        while(!exit) {
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4.Exit");
            System.out.print("Enter Your Choice :");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    account.checkBalance();
                    break;
                case 2:
                    account.withdraw();
                    break;
                case 3:
                    account.deposit();
                    break;
                case 4:
                    exit = true;
                    System.out.println("Thanks for Using SBI ATM!!!!!");
                    System.out.println("Visit Again!!!!");
                    break;
                default:
                    System.out.println("Please Enter a Valid Input!!!!");
            }
        }
    }
}
