public class Cylinder extends Circle {
    private double height;
    public Cylinder(){
        super();
        this.height=1.0;
        System.out.println("Consturced a Cylinder with Cylinder()");
    }
    public Cylinder(double height){
        super();
        this.height=height;
        System.out.println("Consturced a Cylinder with Cylinder(height)");
    }
    public Cylinder(double height, double radius){
        super(radius);
        this.height=height;
        System.out.println("Consturced a Cylinder with Cylinder(height,radius)");
    }
    public double getHeight(){
        return this.height;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public double getVolume(){
        return getArea()*height;
    }
    public String toString(){
        return "This is a Cylinder";
    }
}
