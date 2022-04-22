class Circle{
    public double getPI(){
        return 3.14;
    }
}
public class B21_PassByRef {
    public void calcArea (Circle objPi, double rad){
        double area = objPi.getPI() *rad *rad;
        System.out.println("Area of the circle is "+area);
    }

    public static void main(String[] args) {
        B21_PassByRef p1 = new B21_PassByRef();
        p1.calcArea(new Circle(),2);
    }
}
