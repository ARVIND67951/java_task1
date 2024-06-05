package ATMMachine;

import java.util.Scanner;

class ATM{
    float Balance;
    int pin =1455;
    public void checkpin(){
        System.out.println("Enter your pin:");

        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();
        if(enteredpin == pin){
            menu();
        }else {
            System.out.println("Your pin is not valid");
        }

    }
    public void menu(){
        System.out.println("Enter your choice:");
        System.out.println("1. check A/C Balance");
        System.out.println("2.Withdraw money");
        System.out.println("3.Deposit money");
        System.out.println("4.Exit");
        Scanner sc = new Scanner(System.in);
        int opt =sc.nextInt();
        if(opt ==1){
            checkBalance();
        } else if (opt ==2) {
            withdawmoney();
        } else if (opt == 3) {
            depositmoney();
        } else if (opt == 4) {
            return;
        }else{
            System.out.println("Enter a valid choice");
        }

    }
public void checkBalance(){
    System.out.println("Balance:"+Balance);
    menu();
}
public void withdawmoney(){
    System.out.println("Enter amount to Withdaw:");
    Scanner sc = new Scanner(System.in);
    float amount = sc.nextFloat();
    if(amount>Balance){
        System.out.println("Insufficient Balance");
    }else {
        Balance = Balance - amount;
        System.out.println("Money Withdrawl Successful");
    }
    menu();
}
        public void depositmoney(){
            System.out.println("Enter the amount:");
            Scanner sc = new Scanner(System.in);
            float amount=sc.nextFloat();
            Balance = Balance + amount;
            System.out.println("Money Deposit are Successful");
            menu(); 
        }
}
public class ATMMachine{
    public static void main(String []args){
ATM obg = new ATM();
obg.checkpin();
        
    }
}
