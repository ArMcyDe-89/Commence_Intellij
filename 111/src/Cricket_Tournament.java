public class Cricket_Tournament extends Tournament {
    public int teams;
    public String type = "No Type";
    public Cricket_Tournament(){

    }
    public Cricket_Tournament(String n, int t, String type){
        setName(n); this.teams = t; this.type = type;
    }
    public String detail(){
        String c = String.format("Cricket Tournament Name: %s\nNumber of Teams: %d\nType: %s",getName(),this.teams,this.type); return c;
    }
}
