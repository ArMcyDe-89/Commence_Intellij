public class NikeBD {
    public static int branches;
    public String name;
    public String [] nikes = {"Jordan","Cortez","Kobe"};
    public int [] stocked = new int[3];
    public static String types [] = {"Jordan","Cortez","Kobe"}; // use arrays to measure sold and stocked
    public static int t_stocked [] = new int[3];
    public static int t_sold [] = new int[3];
    public int sold;
    public NikeBD(String n){
        this.name = n; NikeBD.branches++;
    }
    public static void status(){
        System.out.printf("Nike Bangladesh Status:\nBranches Opened: %d\nCurrently Stocked: %s: %d, %s: %d, %s: %d\nSold: %d\n",NikeBD.branches,NikeBD.types[0],NikeBD.t_stocked[0],NikeBD.types[1],NikeBD.t_stocked[1],NikeBD.types[2],NikeBD.t_stocked[2],NikeBD.t_sold[0]+NikeBD.t_sold[1]+NikeBD.t_sold[2]);
    }
    public void details(){
        System.out.printf("Nike %s outlet:\nProducts Currently Stocked: %s: %d, %s: %d, %s: %d\nSold: %d\n",this.name,this.nikes[0],this.stocked[0],this.nikes[1],this.stocked[1],this.nikes[2],this.stocked[2],sold);
    }
    public void restockProducts(String type, int num){
        for(int i =0; i<this.nikes.length;i++){
            if(type.equalsIgnoreCase(this.nikes[i])){
                this.stocked[i]+=num; NikeBD.t_stocked[i]+=num;return;
            }
        }
    }
    public void restockProducts(String [] prods, int [] qty){
        for(int i = 0; i< this.nikes.length; i++){
            if(this.nikes[i].equalsIgnoreCase(prods[i])){
                this.stocked[i]+= qty[i]; NikeBD.t_stocked[i]+=qty[i];
            }
        }
    }
    public void productSold(String s1, int p1, String s2, int p2){
        for(int i =0; i<this.nikes.length; i++){
            if(this.nikes[i].equalsIgnoreCase(s1)){
                this.stocked[i]-=p1; sold+=p1; NikeBD.t_sold[i]+=p1; NikeBD.t_stocked[i]-=p1;
            }
            else if(this.nikes[i].equalsIgnoreCase(s2)){
                this.stocked[i]-=p2; this.sold+=p2; NikeBD.t_sold[i]+=p2; NikeBD.t_stocked[i]-=p2;
            }
        }
    }
}