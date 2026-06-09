
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class LibrarySystem {

    public Book [] Library = new Book[10];
    public Member [] Members = new Member[10];

    public BookNode BookShelf;
    public Member MemberRegistry;

    public int books = 0, members = 0;

    public BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    public PrintWriter pw = new PrintWriter(System.out);

    public void main(String[] args) {
        Book bk = new Book("1st book", "Morgan");
        Member mm = new Member("33333343", "hugh guy");

        pw.println(bk.Details());

        pw.println(mm.Details());

        pw.flush();
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
