import java.util.Scanner;
public class Account {
    private String customerCode;
    private String customerName;
    private int accNumber;
    private long amount = 0;
    public void input(){
        Scanner b1 = new Scanner(System.in);
        do {
            System.out.println("Enter your Code (must be 5 characters long): ");
            customerCode = b1.nextLine();
        }while (customerCode.length() < 5);
            System.out.println("Enter your Name: ");
            customerName = b1.nextLine();
        do {
            System.out.println("Enter your account number (must be a positive number with 6 digits and starts with ‘100’): ");
            accNumber = b1.nextInt();
        }while (accNumber<100000 || accNumber > 101000);
            System.out.println("Enter your amount: ");
            amount = b1.nextLong();
    }
    public void DepositAndWithdraw(){
        long money;
        int type;
        Scanner b2 = new Scanner(System.in);
        System.out.println("Chose a service:");
        System.out.println("0.Deposit \t \t  1.Withdraw");
        type = b2.nextInt();
        System.out.println("Enter money: ");
        money = b2.nextLong();
        if (type == 0){
            System.out.println("You choose deposit "+ money+ " to your amount");
            System.out.println("Success");
            amount = money + amount;
            System.out.println("Your amount: "+ amount);
        }
        if (type == 1){
            if (money > amount){
                System.out.println("Non-sufficient funds");
            }
            else if (money <= amount) {
                System.out.println("You choose withdraw "+ money +" from your amount");
                System.out.println("Success");
                amount = amount - money;
                System.out.println("Amount: "+ amount);
            }
        }
    }
    @Override
    public String toString() {
        return "Account: \nCode: "+ customerCode+"\nName: "+customerName+"\nAccount number: "+accNumber+"\nAmount: "+amount;
    }
}