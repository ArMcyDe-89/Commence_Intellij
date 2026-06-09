public class Circle extends Shape{
//    public static int count;
//    private double radius;
//    private double area;
//    public Circle(){
//
//    }
//    public Circle(double radius){
//        this.setRadius(radius); count++;
//    }
//    public void setRadius(double a){
//        this.radius = a;
//    }
//
//    public double getRadius() {
//        return radius;
//    }
//
//    public double area(){
//        this.area = Math.PI*Math.pow(this.radius,2); return this.area;
//    }
    public static int count;
    public int radius;
    public void area(){
        double area = Math.PI*Math.pow(this.radius,2); System.out.printf("Area of %s Circle: %.2f\n",this.color,area);
    }

}
