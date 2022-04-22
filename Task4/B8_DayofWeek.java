public class B8_DayofWeek {
    public static void main(String[] args) {
        String day = "Monday";
        switch (day){
            case "Sunday":
                System.out.println("First day of the Week");
                break;
            case "Monday":
                System.out.println("Second Day of Week");
                break;
            case "Tuesday":
                System.out.println("Third day of the Week");
                break;
            case "Wednesday":
                System.out.println("Fourth Day of Week");
                break;
            case "Thursday":
                System.out.println("Fifth day of the Week");
                break;
            case "Friday":
                System.out.println("Sixth Day of Week");
                break;
            case "Saturday":
                System.out.println("Seventh day of the Week");
                break;
            default:
                System.out.println("Invalid Day");
        }
    }
}
