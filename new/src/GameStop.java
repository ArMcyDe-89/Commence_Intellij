public class GameStop {
    public HandheldPC [] hh;
    public int count;
    public int deck,ally;
    public GameStop(int p){
        hh = new HandheldPC[p]; System.out.printf("GameStop brought %d devices.\n",p);
    }
    public void addDevice(HandheldPC h){
        if(this.count<this.hh.length){
            if(h instanceof SteamDeck){
                hh[count++] = h; deck++; System.out.printf("%s %s added to shelf\n",h.getBrand(),h.getModel()); return;
            } else if (h instanceof ROGAlly){
                hh[count++] = h; ally++;System.out.printf("%s %s added to shelf\n",h.getBrand(),h.getModel()); return;
            }
            System.out.println("Invalid device type. Only SteamDeck and ROGAlly are allowed."); return;
        } System.out.println("No more space on shelf for new devices.");
    }
    public void listDevices(){
        System.out.printf("Total Devices: %d\nSteam Decks: %d\nROG Allies: %d\nDevices in store:\n",this.count,this.deck,this.ally);
        for(int i =0; i<hh.length; i++){
            System.out.println("-"+hh[i]);
        }
    }
    public void filterByOS(String os){
        System.out.println("Devices running "+os+":");
        for(int i =0; i< hh.length; i++){
            if(hh[i].getOS().equalsIgnoreCase(os)){
                System.out.println("-"+hh[i]);
            }
        }
    }
    public void startGamingSession(HandheldPC h){
        if(h instanceof SteamDeck){
            h.bootUp(); ((SteamDeck) h).launchSteamBigPicture(); return;
        } h.bootUp(); ((ROGAlly)h).syncRGBWithGame();
    }
}
