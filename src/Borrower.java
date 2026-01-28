public class Borrower{
    public String name;
    public String books[] = new String [3];
    private int count;
    public static int book_count[] = {3, 3, 3};
    public static String book_name[] = {"Pather Panchali", "Durgesh Nandini", "Anandmath"};
    public Borrower(){

    }
    public static void bookStatus(){
        System.out.println("Available Books:");
        for(int i = 0; i < Borrower.book_count.length; i++){
            System.out.printf("%s: %d\n",Borrower.book_name[i],Borrower.book_count[i]);
        }
    }
    public Borrower(String name){
            this.name = name;
    }
    public static int remainingBooks(String book){
            for(int i = 0;i<Borrower.book_name.length; i++){
                if(book.equalsIgnoreCase(Borrower.book_name[i])){
                    return (Borrower.book_count[i]);
                }
            }
            return 0;
    }
    public void borrowBook(String book){
            for(int i = 0; i<Borrower.book_name.length; i++){
                if(book.equalsIgnoreCase(Borrower.book_name[i])){
                    if(remainingBooks(book) !=0){
                        this.books[count++] = book; Borrower.book_count[i]--;
                    }
                    else{
                        System.out.println("This book is not available.");
                    }
                }
            }
    }
    public void borrowerDetails(){
            System.out.printf("Name: %s\nBooks Borrowed:\n",this.name);
            for(int i =0; i<this.count; i++){
                System.out.println(books[i]);
            }
    }
}
