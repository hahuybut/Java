public class Laptop extends Product {
    private String CPU;
    public Laptop(String id,String name,int price,String CPU){
        super(id,name,price);
        this.CPU=CPU;
    }
    public String getCPU(){
        return CPU;
    }
    public void setCPU(String CPU){
        this.CPU=CPU;
    }
    @Override
    public String toString(){
        return "ID: "+super.getId()+
                "\nName: "+super.getName()+
                "\nPrice: "+super.getPrice()+
                "\nCPU: "+this.CPU;
    }
}
