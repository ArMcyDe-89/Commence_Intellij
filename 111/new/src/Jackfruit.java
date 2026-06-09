public class Jackfruit extends Fruit{
    public Jackfruit(){
        super(false,"Jackfruit");
    }
    public String toString(){
        if(super.hasFormalin()){
            return super.getName()+"s are bad for you";
        }
        return super.getName()+"s are good for you";
    }
}
