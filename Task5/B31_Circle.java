public class B31_Circle {
    float area;
    public float getPI(){
        return 3.14f;
    }
    public void calcArea(int rad){
        this.area = this.getPI()*rad*rad;
    }
}
