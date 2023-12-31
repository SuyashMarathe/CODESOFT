import java.util.Scanner;
public class BankAccount {
    int balance;
    Scanner sc = new Scanner(System.in);
    void userBalance(int initial){
        this.balance= initial;
    }
    void checkBalance(){
        System.out.println("Your Current Balance is "+balance+" Rupees Only");
    }
    void withdraw(){
        System.out.print("Enter the Amount You Want to Withdraw: ");
       int withdraw= sc.nextInt();
       if(withdraw>balance){
           System.out.println("Insufficient Balance");
       }
       else{
           balance-=withdraw;
           System.out.println("Amount of Rupees "+withdraw+" has been Successfully Withdrawn");
       }

    }
    void deposit(){
        System.out.print("Enter The Amount You Want to Deposit :");
        int deposit=sc.nextInt();
        if(deposit<=0){
            System.out.println("Please Enter a Valid Amount to Deposit");
        }
        else {
            balance = balance + deposit;
            System.out.println("Amount of Rupees " + deposit + " has been Successfully Deposited");
        }
    }

}
