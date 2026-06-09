public class Mango extends Fruit{
    public Mango(){
        super(true,"Mango");
    }
    public String toString(){
        if(super.hasFormalin()){
            return super.getName()+"s are bad for you";
        }
        return super.getName()+"s are good for you";
    }
}
