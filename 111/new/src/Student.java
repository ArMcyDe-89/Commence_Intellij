public class Student extends Section{
    public Student(int s_id, String s_name, int sec_id, String T_name){
        super(sec_id,T_name);
        super.student_name = s_name; super.student_id = s_id;
    }
    public void printStudentInfo(){
        System.out.printf("Student id: %d\nStudent name: %s\n",super.student_id, super.student_name); super.printInfo();
    }
}
public class Student extends Section {
    public static int student_count;
    public final int max_time;
    public final int max_borrow;
    public Student (int id, String name, int sec_id, String teacher_name, int m_time, int m_borrow){
        student_count+=1;
        this.max_time = m_time;
        this.max_borrow = m_borrow;
        this.student_id = id;
        this.student_name = name;
        this.sec_id= sec_id;
        this.teacher_name= teacher_name;
    }

    public void printStudentInfo(){
//        System.out.println("Student id: "+ this.student_id);
//        System.out.println("Student name: "+ this.student_name);
//        System.out.println("Section id: "+ this.sec_id);
//        System.out.println("Teacher name: "+ this.teacher_name);
          System.out.printf("Student id: %d\nStudent name: %s\nSection id: %d\nTeacher name: %s\n",this.student_id,this.student_name,this.sec_id,this.teacher_name);
    }
}

//public class Student{
//    private String name = "Just a Student";
//    private String department = "nothing";
//
//    public void setDepartment(String dpt){
//        this.department = dpt;
//    }
//    public void setName(String name){
//        this.name = name;
//    }
//    public void details(){
//        System.out.println("Name : " + name + " Department: " + department);
//    }
//
//        public String msg = "I love BU";
//        public String shout(){
//            return msg;
//        }
//}
