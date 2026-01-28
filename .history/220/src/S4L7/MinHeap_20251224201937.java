public class MinHeap {
    private int [] arr;
    private int size;

    public MinHeap(){
    }
    public MinHeap(int capacity){
        arr = new int[capacity];
        
    }
    public void insert(int in) {
        if (size<arr.length-1) {
            arr[++size] = in; System.out.println(in+" has been inserted in index "+size); return;
        }System.out.println("Heap is full");
    }
    public int extractMin(){
        return arr[1];
    }
    public void swim(int i){
        if(i==1){return;}
        if (arr[i]<arr[i/2]) {
            int swap = arr[i]; arr[i] = arr[i/2]; arr[i/2] = swap; swim(i/2);
        }
    }
    public void sink(int i){
        if ((2*i < arr.length) && arr[i]>arr[2*i]) {
            int swap = arr[i]; arr[i] = arr[2*i]; arr[2*i] = swap; swim(2*i);
        }
        if ((2*i+1 < arr.length) && arr[i]>arr[2*i+1]) {
            int swap = arr[i]; arr[i] = arr[2*i+1]; arr[2*i+1] = swap; swim(2*i+1);
        }
    }
    public int[] heapsort(){

    }

}
