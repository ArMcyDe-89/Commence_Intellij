public class CustomerService {
    public String [] serving;
    public int count;
    public int max;
    public CustomerService(){

    }
    public CustomerService(int c){
        this.serving = new String[c]; this.max = c;
    }
    public void serveCustomer(){
        if(this.count == 0){
            System.out.println("No customers to serve");
        }
        else{
            System.out.printf("Serving %s\n",this.serving[0]);
            for(int i = 0; i<this.count && i+1<this.count;i++){
                serving[i] = serving[i+1];
            }
            this.count--;
        }
    }
    public void addCustomer(String customer){
        if(this.count<this.max){
            this.serving[this.count++] = customer; System.out.printf("Added: %s\n",customer);
        }
        else{
            System.out.printf("Queue is full. Cannot add %s\n",customer);
        }
    }
}
