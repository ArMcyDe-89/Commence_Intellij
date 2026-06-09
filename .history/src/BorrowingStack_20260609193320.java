public class BorrowingStack {
    public BookNode bn;

    public void push(Book b){
        BookNode bb = bn;
        while(bb.nextBook != null){
            bb = bb.nextBook;
        }
        
    }
}
