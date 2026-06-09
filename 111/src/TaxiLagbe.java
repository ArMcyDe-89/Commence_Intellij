public class TaxiLagbe{
    public String taxi;
    public String coverage;
    public int passengers;
    public int T_pass = 4;
    public String list[] = new String [T_pass];
    public int fares;
    public void storeInfo(String a , String area){
        this.taxi = a;
        this.coverage = area;
    }
    public void printDetails(){
        System.out.printf("Taxi number: %s\nThis taxi can cover %s area\nTotal Passenger: %d\n",this.taxi,this.coverage,this.passengers);
        System.out.println("Passenger Lists: ");
        for(int i = 0; i<this.passengers; i++){
            System.out.print(list[i]+" ");
            if(i == this.passengers-1){System.out.println();}
        }
        System.out.printf("Total collected fare: %d Taka\n",this.fares);
    }
    public void addPassenger(String name, int fare){
        if(this.passengers<this.T_pass){
            this.list[this.passengers] = name;
            this.passengers++;
            this.fares+=fare;
            System.out.printf("Dear %s! Welcome to TaxiLagbe\n",name);
        }
        else{
            System.out.println("Taxi Full! No more passengers can be added");
        }
    }
    public void addPassenger(String name, int fare, String name2, int fare2){
        if(this.passengers<this.T_pass){
            this.list[this.passengers] = name;
            this.passengers++;
            this.fares+=fare;
            System.out.printf("Dear %s! Welcome to TaxiLagbe\n",name);
            this.list[this.passengers] = name2;
            this.passengers++;
            this.fares+=fare2;
            System.out.printf("Dear %s! Welcome to TaxiLagbe\n",name2);
        }
        else{
            System.out.println("Taxi Full! No more passengers can be added");
        }
    }
}