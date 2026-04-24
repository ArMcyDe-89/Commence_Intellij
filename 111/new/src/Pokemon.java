public class Pokemon {
    public String name;
    public Pokemon(){

    }
    public Pokemon(String name){
        this.name = name;
    }
    public void attack(){
        System.out.println(this.name+" attacks with a basic move!");
    }
    public void attack(String move){
        System.out.printf("%s uses %s!\n",this.name, move);
    }
    public void attack(String move, int pow){
        System.out.printf("Pokemon uses %s with power %d!\n",move,pow);
    }
}
//1.b - Method Overloading