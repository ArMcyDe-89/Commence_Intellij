public class Defender extends Football{
    public int tacs,incs;
    public Defender(String n, int a, int s, int t,int i){
        super(n,a,s);
        this.tacs = t; this.incs = i;
    }
    public void display(){
        super.display();
        System.out.printf("Tackles: %d\nInterceptions: %d\n",this.tacs,this.incs);
    }

    public void calculatePerformance() {
        double p = (double)this.incs/this.tacs;
        System.out.printf("Performance: %f\n",p);
    }
}