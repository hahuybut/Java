public class B30_Circle {
    float area;
    public float getPI(){
        return 3.14f;
    }
    public void calcArea(int rad){
        this.area = getPI()*rad*rad;
    }
}
