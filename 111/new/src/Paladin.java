public class Paladin extends Warrior{
    public Paladin(String name, int level){
        super(name, level);
    }
    public void specialMove() {
        System.out.printf("%s unleashes a holy strike!\n",super.name);
    }
    public String toString() {
        return super.name+" "+super.level;
    }
}
