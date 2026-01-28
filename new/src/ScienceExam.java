public class ScienceExam extends Exam{
    public int parts = 2;
    public String subs = "";
    public String part = "";
    public ScienceExam(int marks, int time, String sub1, String sub2){
        super(marks); super.time = time; this.parts+=2; this.subs +=", "+sub1+", "+sub2; this.part += "Part 3 - "+sub1+"\nPart 4 - "+sub2+"\n";
    }
    public ScienceExam(int marks, int time, String sub1, String sub2, String sub3){
        this(marks, time, sub1, sub2); this.parts+=1; this.subs+=", "+sub3; this.part += "Part 5 - "+sub3;
    }
    public String toString(){
        return "Marks: "+super.marks+" Time: "+super.time+" minutes Number of Parts: "+ this.parts;
    }
    public String examSyllabus(){
        return super.examSyllabus()+ this.subs;
    }
    public String examParts(){
        return super.examParts() + this.part;
    }
}
