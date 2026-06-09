public class Book {
    public String Title, Author;
    private int total_copies, available;
    private String ID;

    public Book next;

    public Book(){

    }

    public Book(String T, String A, int t, int a){
        this.Title = T; this.Author = A;
        total_copies = t; available = a;
    }

    public int getTotal(){
        return total_copies;
    }
    public void setTotal(int t){
        total_copies = t;
    }

    public void setAvailable(int a){
        this.available = a;
    }
    public int getAvailable(){
        return available;
    }

    public void setID(String id){
        ID=id;
    }
    public String getID(){
        return this.ID;
    }

    public String Details(){
        String S = String.format("Title: %s\nAuthor: %s\nTotal: %d\nAvailable: %d\nID: %s\n", this.Title,this.Author,this.getTotal(),this.getAvailable(),this.getID());
        return S;
    }

}
