
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class LibrarySystem {

    public BookNode BookShelf = new BookNode(null);
    public MemberNode MemberRegistry[] = new MemberNode[20];

    public int books = 0, members = 0;

    public BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    public PrintWriter pw = new PrintWriter(System.out);

    public static void main(String[] args) {

    }

    public void register(Member m){

        MemberNode M = new MemberNode(m);
        
        int place = hashFunc(m.ID);

        if(MemberRegistry[place] == null){MemberRegistry[place] = M;}
        else{
            
            MemberNode mm = MemberRegistry[place];
            
            while(mm.next != null){
                mm = mm.next;
            }

            mm.next = M;
        }

    }

    public void lookUp(Member m){  

        int place = hashFunc(m.ID);

        MemberNode M = MemberRegistry[place];

        boolean found  = false;

        while(M != null){
            M = M.next;
            if(!(M.member.equals(m))){found = true; break;}
        }

        if(found){re}
    }

    public static int hashFunc(String ID){ // Temporary. Need to come up with something smarter.
        
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

        if(b.equals(BookShelf.book)){
            BookShelf.book = BookShelf.nextBook.book;
            BookShelf.nextBook = BookShelf.nextBook.nextBook;
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
