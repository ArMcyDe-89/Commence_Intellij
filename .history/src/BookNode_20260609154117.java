public class BookNode {
    public Book book;
    public BookNode nextBook;

    public BookNode(Book b){
        book = b;
    }

    public void addBook(Book b){
        BookNode bn = new BookNode(b);
        BookNode nb = nextBook;

        while(nb.nextBook != null){
            nb = nb.nextBook;
        }

        nb.nextBook = bn;

    }

    public void removeBook(Book b){
        BookNode bn = this;
        
    }
}
