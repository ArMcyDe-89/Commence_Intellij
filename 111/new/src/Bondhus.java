public class Bondhus extends SocialMedia{
    public String [] sentbox = new String[5];
    public int sent;
    public Bondhus(String n, String e){
        super(n,e);
    }
    public void sendMessage(String s){
        if(this.sent<5){
            sentbox[sent++] = s; return;
        }
        System.out.println("Sentbox is full.");
    }
    public void showSentbox(){
        System.out.printf("%s's Sentbox\n",super.userName);
        if(this.sent == 0){
            System.out.println("No sent messages."); return;
        }
        for(int i =0; i<this.sent; i++){
            System.out.println(this.sentbox[i]);
        }
    }

    @Override
    public String toString() {
        return super.toString()+"\nMessages Sent: "+this.sent;
    }
}
