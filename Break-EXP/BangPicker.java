import java.util.Random;

public class BangPicker {
    public static void main(String[] args) {
        int S = (int) (Math.random()*8)+6;

        int E = (int) (Math.random()*24)+1;

        //Second method
        Random R = new Random();

        int ss = R.nextInt(8)+1;
        int ee = R.nextInt(24)+1;

        System.out.println("Season: "+S+" Episode: "+E);
        //System.out.println("Season: "+ss+" Episode: "+ee);
    }
}
