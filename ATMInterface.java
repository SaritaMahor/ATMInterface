import java.util.Scanner;

class BankAccount{
    private int bal;

    public int getBal() {
        return bal;
    }

    public void setBal(int bal) {
        this.bal = bal;
    }

    BankAccount(int bal){
        this.bal = bal;
    }
}

class ATMInterface {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100000);
        System.out.println("Welcome to our ATM");
        trasaction(account);
    }

    public static void atmScreen(){
        System.out.println("1.Withdraw");
        System.out.println("2.Deposit");
        System.out.println("3.CheckBalance");
        System.out.println("4.Exit");
    }

    public static int withdraw(int wAmmount, BankAccount account){
        if(account.getBal() < wAmmount){
            System.out.println("Not sufficient Balance");
            return account.getBal();
        }

        account.setBal(account.getBal()-wAmmount);
        System.out.println("Task done");
        return account.getBal();
    }
    public static int deposit(int dAmmount, BankAccount account){
        account.setBal(account.getBal()+dAmmount);
        System.out.println("Task Done");
        return account.getBal();
    }

    public static void checkBalance(BankAccount account){
        System.out.println("Current Balance is: " + account.getBal());
    }

    public static void trasaction(BankAccount account){
        Boolean flag = true;
        int task = 0;
        while(flag){
            
            System.out.println("Select One Option");
            atmScreen();
            Scanner sc = new Scanner(System.in);
            task = sc.nextInt()
            ;

            switch(task){
                case 1: 
                    System.out.println("Enter Ammount");
                    int ammount = sc.nextInt();
                    if (ammount<1) {
                        System.out.println("ammount cannot be less then 1 rs. ");
                        break;
                    }
                    withdraw(ammount, account)
                    ;
                    break;
                case 2:
                    System.out.println("Enter Ammount");
                    ammount = sc.nextInt();
                    if (ammount<1) {
                        System.out.println("ammount cannot be less then 1 rs. ");
                        break;
                    }
                    deposit(ammount, account)
                    ;
                    break;
                case 3:
                    checkBalance(account);
                    break;
                case 4:
                    System.out.println("Bye Bye");
                    flag = false;
                    break;
                default:
                    System.out.println("Choose Valid option");
                    break;
            }
        }
    }
}
