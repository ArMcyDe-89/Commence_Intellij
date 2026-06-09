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

    public BookNode removeBook(Book b){
        BookNode bn = this;
        this  = new BookNode
        if(b.equals(bn.book)){bn=bn.nextBook; return this;}

        while(!(bn.nextBook.book.equals(b))){
            bn = bn.nextBook;
        }
        bn.nextBook = bn.nextBook.nextBook;

        return this;
    }
}
