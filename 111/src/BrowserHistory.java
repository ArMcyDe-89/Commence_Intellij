public class BrowserHistory {
    public String History[];
    public int count;
    public int max;
    public int current;
    public BrowserHistory(){

    }
    public BrowserHistory(int l){
        this.max = l;
        this.History = new String[l];
    }
    public void currentWeb(){
        if(this.count == 0){
            System.out.println("You have not visited any website yet!");
        }
        else{
            System.out.printf("Current web page: %s\n",this.History[this.current]);
        }
    }
    public void visitWeb(String web){
        if(this.count<this.max){
            this.current = this.count;
            this.History[this.count++] = web;
            System.out.printf("Visited: %s\n",web);
        }
        else{
            System.out.printf("History is full. Cannot visit %s web page.\n",web); this.current = this.max-1;
        }
    }
    public void back(){
        this.count=--this.count; --this.current;
    }
    public void showHistory(){
        if(this.count == 0){
            System.out.println("No web pages visited yet.");
        }
        else{
            System.out.println("Browser History:");
            for(int i = 0; i<this.count; i++){
                System.out.printf("%s\n",this.History[i]);
            }
        }
    }

}
