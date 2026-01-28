public class MinHeap {
    private int [] arr;
    private int size;

    public MinHeap(){
    }
    public MinHeap(int capacity){
        arr = new int[capacity];
        
    }
    public void insert(int in) {
        arr[++size] = in; System.out.println(in+" has been inserted.");
    }
    public  extractMin(){

    }
}
