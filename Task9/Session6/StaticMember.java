package Session6;

public class StaticMember {
    public static int staticCounter=0;
    int instanceCounter=0;
    static {
        System.out.println("I am a static block");
    }

    public static void staticMethod() {
        System.out.println("I am a static method");
    }
    public void displayCount(){
       staticCounter++;
       instanceCounter++;
        System.out.println("StaticCounter is: "+staticCounter);
        System.out.println("Instance counter is: "+instanceCounter);
    }

    public static void main(String[] args) {
        System.out.println("I am the main method");
        StaticMember.staticMethod();
        StaticMember objStatic1=new StaticMember();
        objStatic1.displayCount();
        StaticMember objStatic2=new StaticMember();
        objStatic2.displayCount();
        StaticMember objStatic3=new StaticMember();
        objStatic3.displayCount();
    }
}