public class Tennis_Tournament extends Tournament {
    public int players;
    public Tennis_Tournament(){

    }
    public Tennis_Tournament(String name, int p){
        super.setName(name); this.players = p;
    }
    public String detail(){
        String x = String.format("Tennis Tournament Name: %s\nNumber of Players: %d",super.getName(),this.players); return x;
    }
}
