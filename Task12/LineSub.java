public class LineSub extends Point {
    Point end;
    public LineSub(int x1,int y1,int x2, int y2){
        super(x1,y1);
        this.end=new Point(x2,y2);
    }
    public LineSub(Point begin,Point end){
        super(begin.getX(), begin.getY());
        this,end=end;
    }
    public Point getBegin(){
        return this;
    }
    public Point getEnd(){
        return end;
    }
    public void setEnd(Point end){
        this.end=end;
    }

    public int getBeginX(){
        return super.getX();
    }
    public void setBeginX(int x){
        super.setX(x);
    }
    public int getBeginY(){
        return super.getY();
    }
    public void setBeginY(int y) {
        super.setY(y);
    }
    public int[] getBeginXY(){
        return super.setXY(x,y);
    }
    public void setBeginXY(int x,int y){
        super.setXY(x,y);
    }

    public int getEndX(){
        return super.getX();
    }
    public void setEndX(int x){
        super.setX(x);
    }
    public int getEndY(){
        return super.getY();
    }
    public void setEndY(int y) {
        super.setY(y);
    }
    public int[] getEndXY(){
        return super.setXY(x,y);
    }
    public void setEndXY(int x,int y){
        super.setXY(x,y);
    }

    public String toString(){
        return "LineSub[begin="+super.toString()+",end="+end+"]";
    }
    public double getLength(){
        return super.distanced(end);
    }
}
