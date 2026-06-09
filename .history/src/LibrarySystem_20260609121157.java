
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class LibrarySystem {

    public Book [] Library = new Book[Integer.MAX_VALUE];
    public Member [] members = new Member[Integer.MAX_VALUE];

    public int books = 0;

    public BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    public PrintWriter pw = new PrintWriter(System.out)

    public static void main(String[] args) {
        
    }

    public void add(Book b){
        if(books<Integer.MAX_VALUE){
            Library[books++] = b;

        }
    } 

}
