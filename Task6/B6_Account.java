public class B6_Account {
    String id;
    String name;
    int balance;

    public B6_Account(String id, String name){
        this.id = id;
        this.name = name;
        balance = 0;
    }
    public B6_Account(String id, String name, int balance ){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() { return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit (int amount){
        balance+=amount;
        return balance;
    }
    public int debit(int amount){
        if(amount<=balance) {
            balance = balance - amount;
        }
        else {
            System.out.println("amount exceeded");
        }
        return balance;
    }
    public int transferTo(B6_Account another, int amount) {
        if (amount <= balance) {
            balance = balance - amount;
            another.balance+= amount;
        }
        else{
            System.out.println("amount exceeded");
        }
        return balance;
    }

    @Override
    public String toString() {
        return "B6_Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
