public class Travel {
    private static int count;
    private String source;
    private String destination;
    private int time = 1;
    public Travel(){

    }
    public Travel(String source, String destination){
        this.source = source; this.destination = destination; Travel.count++;
    }
    public String displayTravelInfo(){
        String S = String.format("Source: %s\nDestination: %s\nFlight Time: %d:00",this.source,this.destination,this.time);
        return S;
    }
    public void setDestination(String destination){
        this.destination = destination;
    }
    public void setTime(int time){
        this.time = time;
    }
    public void setSource(String source){
        this.source = source;
    }

    public static int getCount(){
        return Travel.count;
    }
}
