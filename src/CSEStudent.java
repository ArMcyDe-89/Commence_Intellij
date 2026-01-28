public class CSEStudent extends SStudent{
    public static int total;
    public static  String [] available = {"CSE110" ,"CSE111", "CSE220", "CSE221"};
    public CSEStudent(String name, int id){
        super(name,id); CSEStudent.total++;
    }
    public static void details(){
        System.out.printf("Total CSE Students: %d\nAvailable Lab Based Courses:\n",CSEStudent.total);
        for(int i = 0; i<CSEStudent.available.length; i++){
            if(i == CSEStudent.available.length-1){
                System.out.println(CSEStudent.available[i]); return;
            }
            System.out.printf("%s ",CSEStudent.available[i]);
        }
    }
    public void addLabBasedCourse(String c){
        for(int i = 0; i<CSEStudent.available.length; i++){
            if(c.equalsIgnoreCase(CSEStudent.available[i])){
                super.courses+=c+" "; return;
            }
        }
        System.out.println("It is not a lab based course!");
    }

}
class SStudent{
    public String name;
    public int id;
    public String courses = "";

    public SStudent(String n, int i){
        name = n;
        id = i;
    }

    public void info(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Courses: "+courses);
    }
}

