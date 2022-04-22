public class B12_TestObjectReferences {
    public static void main(String[] args) {
        B10_Rectangle objRec1 = new B10_Rectangle(10,20);
        B10_Rectangle objRec2;
        objRec2 = objRec1;
        System.out.println("nRectanglel Details");
        System.out.println("====================");

        objRec1.displayDimensions();
        System.out.println("\nRetangle2Details");
        System.out.println("==================");
        objRec2.displayDimensions();

    }
}
