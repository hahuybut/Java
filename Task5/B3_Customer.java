public class B3_Customer {
    int CustomerID;
    String CustomerName;
    String CustomerAddress;
    int CustomerAge;

    public static void main(String[] args) {
        B3_Customer objCustomer1 = new B3_Customer();
        objCustomer1.CustomerID =100;
        objCustomer1.CustomerName ="John";
        objCustomer1.CustomerAddress ="123Street";
        objCustomer1.CustomerAge =30;

        System.out.println("Customer Identification Number: "+objCustomer1.CustomerID);
        System.out.println("CustomerName: "+objCustomer1.CustomerName);
        System.out.println("CustomerAddress: "+objCustomer1.CustomerAddress);
        System.out.println("CustomerAge: "+objCustomer1.CustomerAge);
    }
}
