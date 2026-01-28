public class MinHeap {
    private int [] arr;
    private int size;

    public MinHeap(){
    }
    public MinHeap(int capacity){
        arr = new int[capacity];
        
    }
    public void insert(int in) {
        if (size<arr.length) {
            arr[++size] = in; System.out.println(in+" has been inserted.");
        }System.out.println();
    }
    public int extractMin(){
        return arr[1];
    }

}
