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
        }System.out.println("Heap is full");
    }
    public int extractMin(){
        return arr[1];
    }
    public void swim(int i){
        if (arr[i]<arr[i/2]) {
            int swap = arr[i]; arr[i] = arr[i/2]; arr[i/2] = swap; swim(i/2);
        }
    }
    public void sink(int i){
        if (arr[i]>arr[2*i]) {
            int swap = arr[i]; arr[i] = arr[2*i]; arr[2*i] = swap; swim(2*i);
        }
        if (arr[i]>arr[2*i+1]) {
            int swap = arr[i]; arr[i] = arr[2*i+1]; arr[2*i+1] = swap; swim(2*i);
        }
    }

}
