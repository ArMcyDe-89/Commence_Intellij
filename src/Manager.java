public class Manager extends SportsPerson{
    public int won;
    public Manager(String teamName, String name, String role, int w){
        super(teamName,name,role); this.won = w; super.earningPerMatch = won*1000;
    }
    public void printDetails(){
        System.out.printf("%s\nTeam Role: %s\nTotal Win: %d\nMatch Earning: %.0fK\n", getNameTeam(),super.role,this.won,super.earningPerMatch);
    }
}
