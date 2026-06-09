public class Member {
    public String ID, Name;
    public int current = 0;
    public static final int max = 4;

    public BorrowingStack bs =  new BorrowingStack();

    public Member(String i , String n){
        this.ID = i;
        this.Name = n;
    }

    public String borrow(Book book){
        
        if(this.current < max){
            bs.push(book); current++;
            return "Borrowing Successful.";
        }
        return "Maximum number of books has been borrowed.";
    }

    public String Details(){
        String S = String.format("Name: %s\nID: %s\nBorrowed: %d\n", this.Name,this.ID,this.current);
        return S;
    }
}
