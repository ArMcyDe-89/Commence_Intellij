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
        String S = String.format("Title: %s\nAuthor: %s\nTotal: %d\nAvailable: %d\nID: %s\n", this.Title,this.Author,this.getTotal(),this.getAvailable(),this.getID());
        return S;
    }
}
