public class Warrior extends Character{
    public Warrior(String name, int lev){
        super(name,lev);
    }
    public void specialMove(){
        System.out.printf("%s performs a heavy sword slash!\n",super.name);
    }

    @Override
    public String toString() {
        return super.name+" "+super.level;
    }
}
