//public class Vehicle{
//    public int x;
//    public int y;
//
//    public void moveUp(){
//        y = y+1;
//    }
//    public void moveDown(){
//        y = y-1;
//    }
//    public void moveLeft(){
//        x = x-1;
//    }
//    public void moveRight(){
//        x = x+1;
//    }
//    public String toString(){
//        return "("+ x + ","+ y + ")";
//    }
//}

public class Vehicle {

    private String brand;
    private int year, wheels;

    public Vehicle(String b, int y){
        this.brand = b;
        this.year = y;
    }

    public String getBrand(){
        return this.brand;
    }

    public int getYear(){
        return this.year;
    }

    public void setWheels( int w ){
        this.wheels = w;
    }

    public int getWheels(){
        return this.wheels;
    }

    public String toString(){
        return "Brand: "+this.brand+", Year: "+this.year+", Wheels: "+this.wheels;
    }

}
