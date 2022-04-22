public class B5_TestCustomer {
    public static void main(String[] args) {
        B4_Customer objCustomer = new B4_Customer();
        objCustomer.customerID = 100;
        objCustomer.customerName = "Jack";
        objCustomer.customerAddress = "123 Street";
        objCustomer.customerAge = 30;
        objCustomer.displayCustomerInformation();
        objCustomer.changeCustomerAddress("123 Fort, MainStreet");
        objCustomer.displayCustomerInformation();
    }
}
