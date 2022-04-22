public class P7_B3_SaleProducts {
    public static void main(String[] args){
        System.out.println("Ten SP    Gia     So luong");
        System.out.println("SP1       10000      1    ");
        System.out.println("SP2       20000      2   ");
        System.out.println("SP3       30000      3    ");
        System.out.println("SP4       40000      4    ");
        System.out.println("SP5       50000      5    ");
        int sp1 = 10000;
        int sl1 =1;
        int sp2 = 20000;
        int sl2 =2;
        int sp3 = 30000;
        int sl3 =3;
        int sp4 = 40000;
        int sl4 =4;
        int sp5 = 50000;
        int sl5 =5;
        int total;
        total = sp1*sl1 + sp2*sl2 + sp3*sl3 + sp4*sp4 + sp5*sl5;
        System.out.print("This Total is ");
        System.out.println(total);
    }
}
