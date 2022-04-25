public class Classroom {
    int classid;
    String className;
    public Classroom(int id, String name){
        classid=id;
        className=name;
    }
    public int getClassid(){
        return classid;
    }
    public String getClassName(){
        return className;
    }
    public void setClassid(int id){
        classid=id;
    }
    public void setClassName(String name){
        className=name;
    }

    @Override
    public String toString() {
        return "ClassID "+classid+" ClassName "+className+".";
    }
    public static void main(String[] args){
        Classroom test=new Classroom(1,"T2109A");
        System.out.println(test);
    }
}
