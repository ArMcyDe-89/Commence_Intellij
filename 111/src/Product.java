public class Product {
//    private String name;
//    private double price;
//    private int quantity;
//    private boolean display = false;
//    public Product(){
//    }
//    public Product(String name, double price){
//        this.name = name; this.price = price;
//    }
//    public void setQuantity(int quantity){
//        this.quantity = quantity;
//    }
//    public void displayInfo(){
//        if(this.display == false){
//            System.out.println("Product Name: Unknown\nPrice: $0.0");
//        }
//        else{
//            System.out.printf("Product Name: %s\nPrice: $%.1f\nQuantity: %d\n",this.name,this.price,this.quantity);
//        }
//    }
//    public void displayInfo(boolean display){
//        this.display = display;
//        this.displayInfo();
//    }
//    public double getPrice(){
//        return this.price;
//    }
//    public int getQuantity(){
//        return this.quantity;
//    }

    private int id;
    private String title;
    private int price;

    public Product(int id, String title, int price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public String getIdTitlePrice() {
        return "ID: " + id + " Title: " + title + " Price: " + price;
    }


}
