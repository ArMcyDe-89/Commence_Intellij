public class Nokia extends Mobile{
    public double balance;
    public Nokia(String model, boolean stat, String im, double balance){
        super(model,im,stat); this.balance = balance;
    }
    public String toString(){
        return (super.toString()+"\nBalance: "+this.balance+" TK");
    }
    public String dialCall(String num){
        //String code = ""+num.charAt(0)+num.charAt(1)+num.charAt(2);
        String code = num.substring(0,3);
        String country = super.getCountryName(code);
        if(super.simCardStatus == true){
            if(this.balance>0){
//                if(country == null){
//                    return "Dialing is not allowed in this region.";
//                }
                if((country != null)&&(country.equals("Bangladesh")||country.equals("USA"))){
                    return "Dialing the number "+num+" to "+country+" region.";
                }return "Dialing is not allowed in this region.";
            }
            return "Insufficient balance! Please recharge";
        }
        return "No SIM card available! Please check the SIM card connectivity";
    }
    public  void rechargeSIMCard(int re){
        this.balance+=re; System.out.printf("Recharge successful! Current balance %.1f TK.\n",this.balance);
    }
}
