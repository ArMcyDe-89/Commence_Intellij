public class Player extends SportsPerson{
//    public static int total;
//    public static Player players [] = new Player[11];
//    public String name,country;
//    public int number;
//    public Player(){
//
//    }
//    public Player(String name, String country, int number){
//
//        this.name = name; this.country = country; this.number = number; Player.players[Player.total++] = this;
//    }
//    public String player_detail(){
//        String s = String.format("Player Name: %s\nJersey Number: %d\nCountry: %s",this.name,this.number,this.country);
//        return s;
//    }
//    public static void info(){
//        System.out.println("Total number of players: " + Player.total);
//        System.out.printf("Players enlisted so far: ");
//        for(int i = 0; i < Player.total; i++){
//            if(i == Player.total-1){
//                System.out.println(players[i].name);
//            }else{
//                System.out.printf("%s, ",players[i].name);
//            }
//        }
//    }
    public int goals;
    public  int played;
    public double ratio;
    public Player(String teamName, String name, String role, int goals, int played){
        super(teamName,name,role); this.goals = goals; this.played = played; super.earningPerMatch = (goals*1000) + (played*10);
    }
    public void calculateRatio(){
        this.ratio = 1.00 * this.goals/this.played;
    }
    public void printDetails(){
        System.out.printf("%s\nTeam Role: %s\nTotal Goal: %d, Total Played: %d\nGoal Ratio: %.2f\nMatch Earning: %.0fK\n",getNameTeam(),super.role,this.goals,this.played,this.ratio,super.earningPerMatch);
    }
}
