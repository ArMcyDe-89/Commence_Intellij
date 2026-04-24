public class Student{
//    public String name, email = null,password = null,dep;
//    public int id, course;
//    public String [] courses = new String [3];
//    public boolean logged = false;
//    public Student(){
//    }
//    public Student(String name, int id, String dep){
//        this.name = name; this.id = id; this.dep = dep;
//        System.out.println("Student object is created");
//    }
    public String name;
    public double cgpa;
    public String dep = "CSE";
    public static int ID;
    public int id;
    public static int CSE;
    public Student(){

    }
    public Student(String name, double cgpa){
        this.name = name; this.cgpa = cgpa; this.id = ++Student.ID;Student.CSE++;
    }
    public Student(String name, double cgpa, String dep){
        this.name = name;this.cgpa = cgpa; this.dep = dep; this.id = ++Student.ID; if(dep.equalsIgnoreCase("CSE")){Student.CSE++;}
    }
    public void individualDetail(){
        System.out.printf("ID: %d\nName: %s\nCGPA: %.2f\nDepartment: %s\n",this.id,this.name,this.cgpa,this.dep);
    }
    public static void printDetails(){
        System.out.printf("Total Student(s): %d\nCSE Student(s): %d\nOther Department Student(s): %d\n",Student.ID,Student.CSE,(Student.ID-Student.CSE));
    }
}