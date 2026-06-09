public class ComplexNumber extends RealNumber{
    public double I_val;
    public ComplexNumber(){
        super(1.0); this.I_val = 1.0;
    }
    public ComplexNumber(double r, double i){
        super(r); this.I_val = i;
    }
    public String toString(){
        return super.toString()+"\nImaginaryPart: "+this.I_val;
    }
}
