public class B10_Rectangle {
    int width;
    int height;

    B10_Rectangle(){
        System.out.println("Constructor Invoked...");
        width=10;
        height=10;
    }
    B10_Rectangle(int wid, int heig){
        System.out.println("Parameterized Constructor");
        width = wid;
        height = heig;
    }
    void displayDimensions(){
        System.out.println("Width: "+width);
        System.out.println("Height: "+height);
    }
}
