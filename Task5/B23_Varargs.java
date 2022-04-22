public class B23_Varargs {
    public void addNumber(int...num){
        int sum=0;
        for (int i:num){
            sum = sum+i;
        }
        System.out.println("Sum of number is "+num);
    }

    public static void main(String[] args) {
        B23_Varargs obj = new B23_Varargs();
        obj.addNumber(10,30,20,40);
    }
}
