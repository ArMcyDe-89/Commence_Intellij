public class Striker extends Football{
    public int goals,SOT;
    public Striker(String n, int a, int s, int g,int sot){
        super(n,a,s);
        this.goals = g; this.SOT = sot;
    }
    public void display(){
        super.display();
        System.out.printf("Goals: %d\nShots on target: %d\n",this.goals,this.SOT);
    }

    public void calculatePerformance() {
        double p = (double)this.goals/this.SOT;
        System.out.printf("Performance: %f\n",p);
    }
}
