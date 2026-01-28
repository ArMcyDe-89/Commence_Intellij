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
            int swap = arr[i]; arr[i] = arr[i/2]; arr[i/2] = swap; return swim(i/2);
        }
    }

}
