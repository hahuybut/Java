package Task14;

public class Shape {
    private String color;
    public Shape(String color){
        this.color=color;
    }
    @Override
    public String toString(){
        return "Task14.Shape[color="+color+"]";
    }
    public double getArea(){
        System.out.println("Task14.Shape unknown! Cannot compute area!");
        return 0;
    }
}
