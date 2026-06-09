public class BookNode {
    public Book book;
    public BookNode nextBook;

    public BookNode(Book b){
        book = b;
    }

    public void addBook(Book b){
        BookNode bn = new BookNode(b);
        if(nextBook == null){
            nextBook = bn;
            return;
        }
        BookNode nb = nextBook;
        while(nb.nextBook != null){
            nb = nb.nextBook;
        }
        nb.nextBook = bn;

    }

    public BookNode removeBook(Book b){
        if(b == null) return this;
        // if head needs to be removed
        if(this.book != null && this.book.equals(b)){
            return this.nextBook;
        }
        BookNode prev = this;
        BookNode curr = this.nextBook;
        while(curr != null){
            if(curr.book != null && curr.book.equals(b)){
                prev.nextBook = curr.nextBook;
                break;
            }
            prev = curr;
            curr = curr.nextBook;
        }
        return this;
    }
}
