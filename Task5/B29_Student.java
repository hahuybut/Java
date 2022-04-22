public class B29_Student {
    int rollNo;
    String name;
    String address;
    float marks;
    public B29_Student(){
        rollNo = 0;
        name = "";
        marks = 0;
    }
    public B29_Student(int rNo, String sname){
        rollNo =rNo;
        name = sname;
    }
    public B29_Student(int rNo, float score){
        rollNo=rNo;
        marks=score;
    }
    public B29_Student(String sName, String addr){
        name = sName;
        address = addr;
    }
    public B29_Student(int rNo, String sname, float score){
        rollNo = rNo;
        name = sname;
        marks = score;
    }
    public void displayDetails(){
        System.out.println("Rollno :"+rollNo);
        System.out.println("Student name: "+name);
        System.out.println("Address "+address);
        System.out.println("Score "+marks);
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {
        B29_Student objStud1 = new B29_Student("David","302, Washington Street");
        objStud1.displayDetails();
        B29_Student objStud2 = new B29_Student(103,46);
        objStud2.displayDetails();
        B29_Student objStud3 = new B29_Student(104, "Roger",50);
        objStud3.displayDetails();
    }
}
