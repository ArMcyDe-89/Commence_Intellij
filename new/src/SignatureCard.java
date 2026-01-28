public class SignatureCard extends CreditCard{
    public static int points = 200;
    public int companions = 5;
    public SignatureCard(String name, String account){
        super(name,account,points);
    }
    public void spendCash(int spent){
        System.out.println("Previous Reward Points: "+super.rewardPoints);
        super.rewardPoints+=spent*0.04;
        System.out.printf("Reward points after spending %d taka: %d\n",spent,super.rewardPoints);
    }
    public void cardDetails(){
        super.cardDetails();
        System.out.println("Possible Number of Companions for Lounge: " +this.companions);

    }
}
