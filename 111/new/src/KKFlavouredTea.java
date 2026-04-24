public class KKFlavouredTea extends KKTea{
    public static int flavoured;
    public KKFlavouredTea(String name, int price, int bags){
        super(price, bags); super.name = "KK "+name+" Tea";
    }
    public static void updateSoldStatusFlavoured(KKFlavouredTea tea){
        tea.status = true; KKFlavouredTea.flavoured++; KKTea.total++;
    }
}
