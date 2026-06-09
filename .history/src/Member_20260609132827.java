public class Member {
    public String ID, Name;
    public String borrowed = "";
    public int current = 0;
    public final int max = 4;

    public Member(String i , String n){
        this.ID = i;
        this.Name = n;
    }

    public String Details(){
        String S = String.format("Name: %s\nID: %s\nBorrowed: %d\n", this.Name,this.ID,this.c,this.getAvailable(),this.getID());
        return S;
    }
}
