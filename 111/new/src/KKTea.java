public class KKTea extends Tea{
    public static int total;
    public int bags;
    public static int regular;
    public int weight;
    public KKTea(int price, int bags){
        super("KK Regular Tea",price); this.bags = bags; this.weight = bags*2;
    }
    public void productDetail(){
        super.productDetail(); System.out.printf("Weight: %d, Tea Bags: %d\n",this.weight,this.bags);
    }
    public static void totalSales(){
        System.out.printf("Total Sales: %d\nKK Regular Tea: %d\n",KKTea.total,KKTea.regular);
        if(KKTea.total>KKTea.regular){
            System.out.println("KK Flavoured Tea: "+(KKTea.total-KKTea.regular));
        }
    }
    public static void updateSoldStatusRegular(KKTea tea){
        tea.status = true; tea.regular++; KKTea.total++;
    }
}
