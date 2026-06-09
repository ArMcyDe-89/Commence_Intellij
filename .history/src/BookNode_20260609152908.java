public class BookNode {
    public Book book;
    public BookNode nextBook;

    public BookNode(){
        
    }
    public void addBook(Book b){
        BookeNode bn = new BookNode();
        if(book == null){
            book = b;
        }else{
            nextBook.book = b;
        }
    }
}
