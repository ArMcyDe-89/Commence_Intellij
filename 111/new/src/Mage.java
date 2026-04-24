public class Mage extends Character{
    public Mage(String name, int lev){
        super(name,lev);
    }
    public void specialMove(){
        System.out.printf("%s casts a powerful fireball!\n",super.name);
    }
    public String toString() {
        return super.name+" "+super.level;
    }
}
