
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class LibrarySystem {

    public BookNode BookShelf
    public Member [] Members = new Member[10];

    public BookNode BookShelf;
    public Member MemberRegistry;

    public int books = 0, members = 0;

    public BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    public PrintWriter pw = new PrintWriter(System.out);

    public static void main(String[] args) {

    }

    public void add(Book b){
        if(books<Integer.MAX_VALUE){
            Library[books++] = b;
            pw.printf("%s has been added.\n",b.Title);
        }else{
            pw.println("No more space available;");
        }
        pw.flush();
    }

    public void register(Member m){
        if(members<Integer.MAX_VALUE){
            Members[members++] = m;
            pw.printf("%s has been registered.\n",m.Name);
        }else{
            pw.println("No more slots available;");
        }
        pw.flush();

    }

}
