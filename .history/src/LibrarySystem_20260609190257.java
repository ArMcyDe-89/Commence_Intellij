
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class LibrarySystem {

    public BookNode BookShelf = new BookNode(null);
    public MemberNode MemberRegistry[] = new MemberNode[10];

    public int books = 0, members = 0;

    public BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    public PrintWriter pw = new PrintWriter(System.out);

    public static void main(String[] args) {

    }

    public static int hashFunc(String ID){
        
        int id = Integer.parseInt(ID);
        
        return id%100;
    }

    public void addBook(Book b){
        if(BookShelf.book == null){ BookShelf.book  = b; return;}
        BookNode bn = new BookNode(b);
        BookNode nb = BookShelf.nextBook;

        while(nb.nextBook != null){
            nb = nb.nextBook;
        }

        nb.nextBook = bn;

    }

    public void removeBook(Book b){

        if(b.equals(BookShelf)){
            BookShelf = BookShelf.nextBook.book;
            nextBook = this.nextBook.nextBook;
            return;
        }

        BookNode bn = this.BookShelf;

        while(!(bn.nextBook.book.equals(b))){
            bn = bn.nextBook;
        }
        bn.nextBook = bn.nextBook.nextBook;
    }

    public Book findByTitle(String title){
        
        BookNode bn = this.BookShelf;
        
        while(bn != null && !(bn.book.Title.equals(title))){
            bn = bn.nextBook;
        }
        
        if(bn == null){ return null;}
        return bn.book;
    }

    public Book findByAuthor(String a){
        
        BookNode bn = this.BookShelf;
        
        while(bn != null && !(bn.book.Author.equals(a))){
            bn = bn.nextBook;
        }

        if(bn == null){ return null;}
        return bn.book;
    }

}
