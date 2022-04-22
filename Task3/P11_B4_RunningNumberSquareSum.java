public class P11_B4_RunningNumberSquareSum {
    public static void main(String[] args){
        int lowerbound = 1;
        int upperbound = 100;
        int sum = 0;

        int number = lowerbound;
        while (number <= upperbound){
            sum = sum + number*number;
            ++number;
        }
        System.out.println("This sum is " + sum);
    }
}
