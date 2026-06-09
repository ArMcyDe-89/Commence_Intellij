import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class BookNode {
    
    public BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    public PrintWriter pw = new PrintWriter(System.out);

    public Book book;
    public BookNode nextBook;

    public BookNode(Book b){
        book = b;
    }
    public void addBook(BookNode bn){
        
        BookNode nb = nextBook;

        while(nb.nextBook != null){
            nb = nb.nextBook;
        }

        nb.nextBook = bn;



    }
}
