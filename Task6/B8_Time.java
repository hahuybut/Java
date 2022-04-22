public class B8_Time {
    int hour;
    int minute;
    int second;

    public B8_Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String toString() {
        return +hour+ ":" + minute+ ":" + second;
    }

    public B8_Time nextSecond(){
        if(hour == 23 && minute == 59 && second == 59){
            setTime(0,0,0);
        }
        else  if(minute == 59 && second == 59){
            setTime(hour+1,0,0);
        }else if(second == 59){
            setTime(hour,minute+1,0);
        }else {
            second++;
        }
        return this;
    }

    public B8_Time previousSecond(){
        if(hour == 0 && minute == 0 && second == 0){
            setTime(23,59,59);
        }
        else  if(minute == 0 && second == 0){
            setTime(hour-1,59,59);
        }else if(second == 0){
            setTime(hour,minute-1,59);
        }else {
            second--;
        }
        return this;
    }

    public static void main(String[] args) {
        B8_Time b1 = new B8_Time(5,59,59);
//        System.out.println(b1.nextSecond());
        System.out.println(b1.previousSecond());
    }
}
