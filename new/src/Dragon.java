public class Dragon extends MagicalCreature{
    public int lev;
    public Dragon(String name, int age, int l){
        super(name,age); this.lev =  l;
    }
    public void makeSound(){
        System.out.printf("%s roars with fiery breath!\n",super.name);
    }
    public void performMagic(){
        System.out.printf("%s breathes fire with power level: %d\n",super.name,this.lev);
    }
    public void fly(){
        System.out.println(super.name+" flies through the sky");
    }
}
