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

        if(b.equals(book)){
            book = this.nextBook.book;
            nextBook = this.nextBook.nextBook;
            return;
        }

        BookNode bn = this;

        while(!(bn.nextBook.book.equals(b))){
            bn = bn.nextBook;
        }
        bn.nextBook = bn.nextBook.nextBook;
    }

    public Book findByTitle(Book b){

        
    }
}
