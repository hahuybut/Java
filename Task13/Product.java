public class Product {
    private String id;
    private String name;
    private int price;
    public Product(String id,String name,int price){
        this.id=id;
        this.name=name;
        this.price=price;
    }
    public String getId(){
        return id;
    }
    public String getName() {
        return name;
    }
    public double getPrice(){
        return price;
    }
    public void setId(String id) {
        this.id=id;
    }
    public void setName(String name) {
        this.name=name;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public String toString(){
        return "ID: "+id +"\n"+
                "Name: "+name +"\n"+
                "Price: "+price;
    }
}
