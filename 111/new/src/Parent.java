public class Parent {
    public static int temp;
    public int a = 10, b = 5;
    public Parent(){
        a = temp*6;
        b = a-1;
        Parent.temp+=1;
    }
    public void methodA(int x, int y){
        a = ++y - b; b = (--temp) + x + Parent.temp; x-= y + this.b; System.out.println(x+" "+this.b+" "+this.a);
    }
    public void methodB(int x, int y){
        int b = 0; b = y + this.temp; this.a+=y; this.b = x-b; System.out.println(this.a+" "+this.b+" "+b);
    }
}
class Child extends Parent{
    public int sum = 6, a = 0;
    public Child(){
        sum+=1; a = Child.temp - a; super.a = sum-temp;
    }
    public Child(Child obj){
        super(); a = obj.sum + temp; sum+=super.b;
    }
    public void methodB(int a, int b){
        this.a+=a-1; this.b+=b; sum+=this.a + a; System.out.println(this.a+" "+this.b+" "+sum); super.methodB(this.a,this.b);
    }
}
class Tester{
    public static void main(String [] args){
        Child c1 = new Child(); c1.methodA(1,2);
        Child c2 = new Child(c1); c2.methodB(-3,7);
    }
}