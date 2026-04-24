public class ROGAlly extends HandheldPC{
    public boolean RGB;
    public boolean sync;
    public ROGAlly(String mod, int ram, int sto, boolean r){
        super("ASUS",mod,"Windows 11",ram,sto); this.RGB = r;
    }

    @Override
    public void bootUp() {
        String stat = "OFF";
        if(this.RGB == true){
            stat = "ON";
        }
        System.out.printf("%s (%s) booting into %s with RGB %s\n",this.getClass().getName(),super.getModel(),super.getOS(), stat);
    }
    public void syncRGBWithGame(){
        if(this.RGB == false){
            System.out.printf("%s has RGB disabled.\n",super.getModel()); return;
        }
        this.sync = true; System.out.printf("%s syncing RGB lights with gameplay...\n",super.getModel());
    }
}
