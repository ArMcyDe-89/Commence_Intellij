public class BookNode {
    public Book book;
    public BookNode nextBook;

    public BookNode(Book b){
        book = b;
    }
    public void addBook(Book b){
        BookNode bn = new BookNode(b);
        if(book == null){
            book = b;
        }else{
            nextBook.book = b;
        }
    }
}
