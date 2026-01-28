public class PlatinumCard extends CreditCard{
    public static int points = 100;
    public PlatinumCard(String name, String account){
        super(name,account,points);
    }
    public void spendCash(int spent){
        System.out.println("Previous Reward Points: "+super.rewardPoints);
        super.rewardPoints+=spent*0.02;
        System.out.printf("Reward points after spending %d taka: %d\n",spent,super.rewardPoints);
    }
}
