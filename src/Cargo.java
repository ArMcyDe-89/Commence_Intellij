public class Cargo {
    private static double capacity = 10.0;
    public static int ID;
    private int id;
    private String name;
    private double weight;
    private boolean loaded;
    public static double capacity(){
        return Cargo.capacity;
    }
    public Cargo(){

    }
    public Cargo(String name, double weight){
        this.name = name; this.weight += weight; this.id = ++ID;
    }
    public void details(){
        System.out.printf("Cargo ID: %d, Contents: %s, Weight: %.1f, Loaded: %b\n",this.id,this.name,this.weight,this.loaded);
    }
    public void load(){
        if((Cargo.capacity-this.weight)>=0){
            this.loaded = true;  Cargo.capacity-=this.weight;
            System.out.printf("Cargo %d loaded for transport.\n",this.id);
        }
        else{
            System.out.println("Cannot load cargo, exceeds weight capacity.");
        }
    }
    public void unload(){
        this.loaded = false; Cargo.capacity+=this.weight; System.out.printf("Cargo %d unloaded.\n",this.id);
    }
}