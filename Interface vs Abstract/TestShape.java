public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Rectangle(11,21);
        System.out.println(s1);

        System.out.println("Area is "+s1.getArea());

        Shape s2 = new Triangle(31,41);
        System.out.println(s2);

        System.out.println("Area is "+s2.getArea());
    }
}
