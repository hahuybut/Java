public class B5_InvoiceItem {
    String id;
    String desc;
    int qty;
    double uniPrice;

    public B5_InvoiceItem(String id, String desc, int qty, double uniPrice){
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.uniPrice = uniPrice;
    }

    public String getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUniPrice() {
        return uniPrice;
    }

    public void setUniPrice(double uniPrice) {
        this.uniPrice = uniPrice;
    }

    public double getTotal(){
        return uniPrice*qty;
    }

    @Override
    public String toString() {
        return "B5_InvoiceItem{" +
                "id='" + id + '\'' +
                ", desc='" + desc + '\'' +
                ", qty=" + qty +
                ", uniPrice=" + uniPrice +
                '}';
    }
}
