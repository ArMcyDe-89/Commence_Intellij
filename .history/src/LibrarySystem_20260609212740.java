
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class LibrarySystem {

    public static BookNode BookShelf = new BookNode(null);
    public static MemberNode MemberRegistry[] = new MemberNode[20];
    public static ReturnQueue Returns = new ReturnQueue();

    public int books = 0, members = 0;

    public static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter pw = new PrintWriter(System.out);

    public static void main(String[] args) {

    }

    public static void processReturns(){

    }

    public static void register(Member m){

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

    public static void lookUp(Member m){  

        int place = hashFunc(m.ID);

        MemberNode M = MemberRegistry[place];

        boolean found  = false;

        while(M != null){
            M = M.next;
            if(!(M.member.equals(m))){found = true; break;}
        }

        if(found){ pw.printf("%s is a member.\n", m.Name);}
        else{pw.println(m.Name+" is not a member.");}
        pw.flush();
    }

    public static void remove(Member m){

        int place = hashFunc(m.ID);

        MemberNode M = MemberRegistry[place];

        if(M.member.equals(m)){MemberRegistry[place] = M.next;}

        while(M.next != null){
            
            if(M.next.member.equals(m)){
                M.next = M.next.next; return;
            }
            
            M = M.next;

        }

        pw.println("Member not found."); pw.flush();

    }

    public static int hashFunc(String ID){ // Temporary. Need to come up with something smarter.
        
        int id = Integer.parseInt(ID);
        
        return id%100;
    }

    public static void addBook(Book b){
        if(BookShelf.book == null){ BookShelf.book  = b; return;}
        BookNode bn = new BookNode(b);
        BookNode nb = BookShelf.nextBook;

        while(nb.nextBook != null){
            nb = nb.nextBook;
        }

        nb.nextBook = bn;

        b.setAvailable(b.getAvailable()+1);

    }

    public static void removeBook(Book b){

        if(b.equals(BookShelf.book)){
            BookShelf.book = BookShelf.nextBook.book;
            BookShelf.nextBook = BookShelf.nextBook.nextBook;

            b.s
            return;
        }

        BookNode bn = BookShelf;

        while(!(bn.nextBook.book.equals(b))){
            bn = bn.nextBook;
        }
        bn.nextBook = bn.nextBook.nextBook;
    }

    public static Book findByTitle(String title){
        
        BookNode bn = BookShelf;
        
        while(bn != null && !(bn.book.Title.equals(title))){
            bn = bn.nextBook;
        }
        
        if(bn == null){ return null;}
        return bn.book;
    }

    public static Book findByAuthor(String a){
        
        BookNode bn = BookShelf;
        
        while(bn != null && !(bn.book.Author.equals(a))){
            bn = bn.nextBook;
        }

        if(bn == null){ return null;}
        return bn.book;
    }

}
