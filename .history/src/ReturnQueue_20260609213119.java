public class ReturnQueue {
    BookNode bn;

    public void enqueue(Book b){
        BookNode bb = bn;

        if(bn == null){ bn = new BookNode(b);return;}

        while(bb.nextBook != null){
            bb = bb.nextBook;
        }
        bb.nextBook = new BookNode(b);
    }

    public Book dequeue(){
        BookNode bb = bn;
        bn = bn.nextBook;
        return bb.book;
    }

    public boolean isEmpty(){
        return bn
    }
}
