public class B6_TestAccount {
    public static void main(String[] args) {
        B6_Account b1 = new B6_Account("01","But",1000);
        B6_Account b2 = new B6_Account("02", "Butt", 400);
        System.out.println(b1);
        System.out.println("transferTo: "+b1.transferTo(b2,100));
        System.out.println("Credit: "+b1.credit(200));
        System.out.println("Debit: "+b1.debit(250));
    }
}
