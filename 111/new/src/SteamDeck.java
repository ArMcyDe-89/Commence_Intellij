public class SteamDeck extends HandheldPC{
    public boolean bp;
    public SteamDeck(String mod,int ram, int sto){
        super("Valve",mod,"SteamOS",ram, sto);
    }
    public void bootUp(){
        System.out.println("Steam Deck ("+super.getModel()+") booting into "+getOS()+"...");
    }
    public void launchSteamBigPicture(){
        this.bp= true;
        System.out.println(super.getModel()+" is launching Steam Big Picture Mode.");
    }
}
