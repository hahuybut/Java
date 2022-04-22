public class B1_Circle {
    private String color;
    private double radius;
    public B1_Circle(){
       radius=1.0;
       color="red";
    }
    public B1_Circle(double r){
        color="red";
        radius=r;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                ", radius=" + radius +
                '}';
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
}
