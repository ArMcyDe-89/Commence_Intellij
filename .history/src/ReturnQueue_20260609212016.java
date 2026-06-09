public class ReturnQueue {
    BookNode bn;

    public void push(Book b){
        BookNode bb = bn;

        if(bn == null){ bn = new BookNode(b);return;}

        while(bb.nextBook != null){
            bb = bb.nextBook;
        }
        bb.nextBook = new BookNode(b);
    }

    public Book pop(){
        
    }
}
