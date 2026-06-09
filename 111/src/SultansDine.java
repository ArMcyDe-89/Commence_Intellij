public class SultansDine {
    public String branch;
    public int Q;
    public int B_sell;
    public double B_S_P;
    public static SultansDine [] arr = new SultansDine[3];
    public static double T_sell;
    public static int branches;
    public static void details(){
        System.out.printf("Total Number of branch(s): %d\nTotal Sell: %.2f Taka\n",SultansDine.branches,SultansDine.T_sell);
        if(SultansDine.T_sell>0){
            for(int i =0; i<SultansDine.branches;i++){
                SultansDine S = SultansDine.arr[i];
                System.out.printf("Branch Name: %s, Branch Sell: %,d Taka\nBranch consists of total sell's %.2f%%\n",S.branch,S.B_sell,(S.B_sell/SultansDine.T_sell)*100);
            }
        }
    }
    public SultansDine(){

    }
    public SultansDine(String branch){
        this.branch = branch; SultansDine.arr[SultansDine.branches++] = this;
    }
    public void sellQuantity(int Q){
        this.Q = Q;
        if(Q<10){
            this.B_sell = Q*300; SultansDine.T_sell+=this.B_sell;
        } else if (Q<20 && Q>=10) {
            this.B_sell = Q*350; SultansDine.T_sell+=this.B_sell;
        }
        else {
            this.B_sell = Q*400; SultansDine.T_sell+=this.B_sell;
        }
    }
    public void branchInformation(){
        System.out.printf("Branch Name: %s\nBranch Sell: %d Taka\n",this.branch,this.B_sell);
    }
}
