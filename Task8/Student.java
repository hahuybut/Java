public class Student {
    int RollNo;
    String name;
    Classroom myClass;
    public Student(int rollNo,String Name){
        RollNo=rollNo;
        name=Name;
    }
    public Student(int rollNo,String Name,Classroom myClass){
        RollNo=rollNo;
        name=Name;
        this.myClass=myClass;
    }
    public int getRollNo(){
        return RollNo;
    }
    public String getName(){
        return name;
    }
    public Classroom getMyClass(){
        return myClass;
    }
    public String toString(){
        return "RollNo: "+RollNo+" "+
                "Name: "+name+" "+
                " "+myClass;
    }

    public static void main(String[] args) {
        Classroom test=new Classroom(2,"T2109B");
        Student thu=new Student( 01 ,"Ha Huy But ",new Classroom(2,"T2109B"));
        System.out.println(thu);
    }
}
