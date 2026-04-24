public class Book {
    public String title, author;
    public int total, borrowed, available;
    private final int ISBN;

    public Book(int isbn, String title, String author,int total){
        this.title = title;
        this.author = author;
        this.total = total;
        this.ISBN = isbn;
    }

    public int getAvailable(){
        return available;
    }

}
