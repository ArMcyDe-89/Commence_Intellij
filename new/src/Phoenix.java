public class Phoenix extends MagicalCreature{
    public int reb;
    public Phoenix(String name, int age, int r){
        super(name,age); this.reb =  r;
    }
    public void makeSound(){
        System.out.printf("%s sings an enchanting song.\n",super.name);
    }
    public void performMagic(){
        System.out.printf("Fawkes is reborn with %d rebirth cycles\n",this.reb);
    }
    public void regenerate(){
        System.out.println(super.name+" regenerates its body in a burst of flames.");
    }
}
