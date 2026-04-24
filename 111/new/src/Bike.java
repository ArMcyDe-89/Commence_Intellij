public class Bike extends Vehicle{
    public String model;
    public boolean side;

    public Bike(String brand,String model, int year, int wheels, boolean side){
        super(brand,year); super.setWheels(wheels); this.model = model; this.side = side;
    }
    public String toString() {
        return "Bike "+super.toString() +", Model: "+this.model+", SideCar: "+ this.side;
    }
    public void doAWheelie(){
        if(this.side == true){
            System.out.printf("Wheelie Failed. %s:%s has SideCar\n",super.getBrand(),this.model); return;
        }
        System.out.printf("%s:%s is doing Wheelie!!\n",super.getBrand(),this.model);
    }
}
