import java.util.Scanner;

class BankAcc{
    private String contactnumber,name,accnum,address;
    private double balance,roi;
    
    public void createAccount(Scanner sc){
        System.out.println("Enter Full Name: ");
        name = sc.nextLine();
        
        System.out.println("Enter Conact Number: ");
        contactnumber = sc.nextLine();
        
        System.out.println("Enter Account Number: ");
        accnum = sc.nextLine();
        
        System.out.println("Enter Address: ");
        address = sc.nextLine();
        
        System.out.println("Enter Your Initial Balance: ");
        balance = sc.nextInt();
        
        System.out.println("Enter Rate Of interest: ");
        roi = sc.nextDouble();
        sc.nextLine();
        
        System.out.println("Account Created Successfully.");
    }

    public void deposit(Scanner sc){
        System.out.println("Enter Amount To Deposit: ");
        double amt = sc.nextDouble();

        if(amt > 0){
            balance += amt;
            System.out.println("Balance Credited To Your Accout.");
        }else{
            System.out.println("Invalid Num.");
        }
    }

    public void withdraw(Scanner sc){
        System.out.println("Enter Amount To Withdraw: ");
        double wd = sc.nextDouble();
        if(wd > 0 && wd <= balance){
            balance -= wd;
            System.out.println("Withdraw Successful.");
        }else{
            System.out.println("Amount Should be more than 0.");
        }
    }

    public void computeInterest(Scanner sc){
        double interest = ((balance * roi)/100);
        System.out.println("Rate Of Intrest is " + interest);
    }

    public void displayBalance(){
        System.out.println("Your Balance is " + balance);
    }
}

public class Assignment{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        BankAcc account = new BankAcc();

        boolean exit = false;

        while(!exit){
            System.out.println("---------------------Banking Menu-----------------------");
            System.out.println("1.Create Account\n 2.Deposit\n 3.Withdraw\n 4.Rate Of Intrest\n 5.Display Balance\n 6.Exit\n");
            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1-> account.createAccount(sc);
                case 2-> account.deposit(sc);
                case 3-> account.withdraw(sc);
                case 4-> account.computeInterest(sc);
                case 5-> account.displayBalance(sc);
                case 6-> {
                    exit = true;
                    System.out.println("Thankyou Goodbye!");
                }
                default -> System.out.println("Invalid Choice.");
            }

        }
        sc.close();
    }


}
