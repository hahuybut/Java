public class Phone extends Product {
    private String Chip;
    public Phone(String id,String name,int price,String Chip){
        super(id,name,price);
        this.Chip=Chip;
    }
    public String getCPU(){
        return Chip;
    }
    public void setCPU(String CPU){
        this.Chip=Chip;
    }
    @Override
    public String toString(){
        return "ID: "+super.getId()+
                "\nName: "+super.getName()+
                "\nPrice: "+super.getPrice()+
                "\nChip: "+this.Chip;
    }
}