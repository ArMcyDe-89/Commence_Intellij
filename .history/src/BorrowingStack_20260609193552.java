public class BorrowingStack {
    public BookNode bn;

    public void push(Book b){
        BookNode bb = bn;
        while(bb.nextBook != null){
            bb = bb.nextBook;
        }
        BookNode nb = new BookNode(b);
        bb.nextBook = nb;
    }

    public return pop(){
        BookNode bb = bn;
        while(bb.nextBook.nextBook != null){
            bb = bb.nextBook;
        }
    }
}
