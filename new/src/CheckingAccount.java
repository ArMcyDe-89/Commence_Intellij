public class CheckingAccount extends Account{
    public static int count;
    public CheckingAccount(){
        super(0.0); ++CheckingAccount.count;
    }
    public CheckingAccount(double balance){
        super(balance); ++CheckingAccount.count;
    }
}
