public class Garage {
    public Car [] cars;
    public int car;
    public Bike [] bikes;
    public int bike;
    public Garage(int c, int b){
        cars = new Car [c];
        bikes = new Bike[b];
        System.out.println("Welcome to the Garage!");
        System.out.printf("Car Capacity: %d\nBike Capacity: %d\n",c,b);
    }
    public void addVehicle(Vehicle v){
        if(v instanceof Car){
            if(this.car<this.cars.length){
                cars[this.car++] = (Car) v; System.out.printf("A %s %s has been added to the Garage\n",((Car) v).getBrand(),((Car) v).getClass().getName().toUpperCase()); return;
            }
            System.out.printf("Can't add more Cars! Capacity: %d\n",this.car); return;
        }
        if(this.bike<this.bikes.length){
            bikes[bike++] = (Bike) v; System.out.printf("A %s BIKE has been added to the Garage\n",((Bike)v).getBrand()); return;
        }
        System.out.printf("Can't add more Bikes! Capacity: %d\n",this.bike);
    }
}
