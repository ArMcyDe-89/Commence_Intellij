public class InPatient extends Patient{
    public String dep;
    public static int IN;
    public InPatient(String n, String d, String dep){
        super(n,d); this.dep = dep;InPatient.IN++; System.out.println("New patient admitted in "+ dep);
    }

    @Override
    public String toString() {
        return super.toString()+"\nDepartment: "+this.dep;
    }
    public static void details(){
        Patient.details();
        System.out.printf("Admitted In-Patients: %d.\nOut-Patients: %d.\n",InPatient.IN,(Patient.all-InPatient.IN));
    }
}
