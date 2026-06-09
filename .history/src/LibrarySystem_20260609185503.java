
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
        return id
    }

}
