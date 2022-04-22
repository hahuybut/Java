public class B2_CircleClass {
    double radius;

    public B2_CircleClass(){
        radius = 1.0;
    }

    public B2_CircleClass(double r){
        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }

    public double getCircumference(){
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "B2_CircleClass{" +
                ",radius=" + radius +
                ",Area: " + getArea()+
                ",Circumference: " + getCircumference()+
                '}';
    }
}
