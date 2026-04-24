public class Car extends  Vehicle{
    public String model;
    public int door;
    public boolean ai;
    public Car(String brand,String model, int year, int door, int wheels, boolean ai){
        super(brand, year); super.setWheels(wheels); this.door = door; this.model = model; this.ai = ai;
    }

    public String toString() {
        return "Car "+super.toString() +", Model: "+this.model+", Doors: "+this.door+", AI: "+ this.ai;
    }
    public void startAutoPilot(){
        if(this.ai == false){
            System.out.printf("%s:%s has NO AutoPilot\n",super.getBrand(),this.model); return;
        }
        System.out.printf("%s:%s AutoPilot Started\n",super.getBrand(),this.model);
    }
}
