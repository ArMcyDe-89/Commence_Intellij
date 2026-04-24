public class Parcel{
    public String name; public int weight; public double fee;
    public void printDetails(){
        if(this.name == null){System.out.println("Set name first");}
        else{System.out.printf("Name: %s\nTotal weight: %d\nTotal fee: %.1f\n",name,weight,fee);}
    }
    public Parcel(){}
    public Parcel(String a){ this.name = a;}
    public Parcel(String a, int w){
        this(a);
        this.weight = w;
    }
    public void addWeight(int w){this.weight+=w; System.out.printf("Updated weight: %d\n",this.weight);}
    public void calcFee(String L){int l_c; if(L.equalsIgnoreCase("Dhanmondi")){l_c = 50;} else{l_c = 0;} this.fee = (this.weight*20) + l_c;}
}