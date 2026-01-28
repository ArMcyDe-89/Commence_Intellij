public class patient {
    public int id,age;
    public String name,bloodGroup;
    public patient next;
    public patient prev;
    public patient(){
        int id = 0,age=0; String name= null, bloodGroup = null; next=null; prev =null;
    }
    public patient(int i, int a , String n, String b){
        this.id = i; this.age = a; this.name = n; this.bloodGroup = b;
    }
}
