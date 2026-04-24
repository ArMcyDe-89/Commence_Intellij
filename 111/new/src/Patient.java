public class Patient {
    public static int all;
    public String name, Doctor;
    public String id;
    public Patient(String n, String d){
        this.name = n; this.Doctor= d; Patient.all++;
        if(Patient.all<10){
            this.id = "P0"+Patient.all; return;
        }
        this.id="P"+Patient.all;
    }

    @Override
    public String toString() {
        return "Patient ID: "+this.id+", Name: "+this.name+"\nDoctor: "+this.Doctor;
    }

    public static void details(){
        System.out.println("Total patients: "+ Patient.all);
    }
    public static void details(Patient [] p){
        System.out.printf("Details of %d selected patients:\n",p.length);
        System.out.println("== == == == ==");
        for(int j = 0 ; j<p.length; j++){
            System.out.println(p[j]);
            System.out.println("== == == == ==");
        }
    }
}
