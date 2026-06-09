public class BorrowingStack {
    public BookNode bn;

    public void push(Book b){
        if
        BookNode bb = bn;
        while(bb.nextBook != null){
            bb = bb.nextBook;
        }
        BookNode nb = new BookNode(b);
        bb.nextBook = nb;
    }

    public Book pop(){
        BookNode bb = bn;
        while(bb.nextBook.nextBook != null){
            bb = bb.nextBook;
        }
        return bb.nextBook.book;
    }
}
