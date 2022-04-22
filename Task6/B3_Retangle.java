public class B3_Retangle {
    float length;
    float width;

    public B3_Retangle(){
        length = 1.0f;
        width = 1.0f;
    }

    public B3_Retangle(float l, float w){
        length = l;
        width = w;
    }

    public float getLength(){
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea(){
        return length*width;
    }

    public double getPerimeter(){
        return (length + width)*2;
    }

    @Override
    public String toString() {
        return "B3_Retangle{" +
                "length=" + length +
                ", width=" + width +
                ", Area=" + getArea() +
                ", Perimeter=" + getPerimeter() +
                '}';
    }
}
