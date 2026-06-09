public class Book {
    public String Title, Author;
    private int total_copies, available;
    private String ID;

    public Book(){

    }

    public Book(String T, String A){
        this.Title = T; this.Author = A;
    }

    public int getTotal(){
        return total_copies;
    }
    public void setTotal(int t){
        total_copies = t;;
    }

    public void setAvailable(int a){
        this.available = a;
    }
    public int getAvailable(){
        return available;
    }

}
