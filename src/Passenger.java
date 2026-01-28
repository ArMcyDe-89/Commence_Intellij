public class Passenger {
    public String name;
    public double distance;
    private double weight;
    public static int no_of_passenger;
    public static double total_fare = 0.0;
    public Passenger(){

    }
    public Passenger(String name,double distance){
        this.name = name; this.distance = distance; Passenger.no_of_passenger+=1;
    }
    public void passengerDetails(){
        double fare = this.distance*20 + this.weight*10;
        Passenger.total_fare+=fare;
        System.out.printf("Name: %s\nFare: %.1f TK\n",this.name,fare);
    }
    public void storeBaggageWeight(double weight){
        this.weight = weight;
    }
}
