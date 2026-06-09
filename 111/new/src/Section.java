public class Section {
    public int sec_id;
    public String teacher_name;
    public int student_id;
    public String student_name;
    public Section(int id, String name){
        this.sec_id = id;
        this.teacher_name = name;
    }

    public void printInfo(){
        System.out.println("Section id: "+ this.sec_id);
        System.out.println("Teacher name: "+ this.teacher_name);
    }

    public static int section_count;
    public int sec_id, student_id; public String teacher_name, student_name;
    public Section(){

    }
    public Section(String T){
        this.teacher_name = T; this.sec_id = ++Section.section_count;
    }
}
