public class Member {
    public String ID, Name;
    public String borrowed = "";
    public int current = 0;
    public final int max = 4;

    BorrowingStack bs =  new BorrowingStack();

    public Member(String i , String n){
        this.ID = i;
        this.Name = n;
    }

    public void borrow(Book book){
        
        if(this.current < max){
            bs.push(book);
            return "Borrowing Successful.";
        }
        return "Maximum number of books has been borrowed.";
    }

    public String Details(){
        String S = String.format("Name: %s\nID: %s\nBorrowed: %d\n", this.Name,this.ID,this.current);
        return S;
    }
}
