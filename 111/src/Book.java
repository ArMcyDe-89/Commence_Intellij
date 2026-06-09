public class Book extends Product{
//    public static int total_books_sold;
//    public static double total_revenue = 0.0;
//    public String name;
//    public double price = 150;
//    public Book(){
//
//    }
//    public Book(String name, int discount){
//        this.name = name; this.price = this.discounted(discount); Book.total_books_sold+=1; Book.total_revenue+=this.price;
//    }
//    private double discounted(int discount){
//        double new_price = ((100-discount)/100.0)*price; return new_price;
//    }
//    public void bookDetails(){
//        System.out.printf("Title: %s\nPrice after Discount: %.1f TK\n",this.name,this.price);
//    }
    public String ISBN;
    public String publisher;
    public Book(int id, String title, int price, String isbn, String pub){
        super(id, title, price);this.ISBN = isbn; this.publisher = pub;
    }
    public String printDetail(){
        String p = getIdTitlePrice()+ " ISBN: " + this.ISBN + " Publisher: " + this.publisher; return p;
    }
}
