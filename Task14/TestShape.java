package Task14;

public class TestShape {
    public static void main(String[] args) {
        Shape s1=new Retangle("red",4,5);
        System.out.println(s1);

        Shape s2=new Triangle("blue",4,5);
        System.out.println(s2);
        System.out.println("Area is "+s2.getArea());
    }
}
