public class MinHeap {
    private Integer [] heap;
    private int size;
    public MinHeap(){
    }
    public MinHeap(int capacity){
        heap = new Integer[capacity+1]; size =0;
    }
    public void swim(int i){
        if((i>1)&&(heap[i/2]>heap[i])){
            int swap = heap[i]; heap[i] = heap[i/2]; heap[i/2] = swap; swim(i/2);
        } System.out.println("Swimming Complete");
    }
    public void sink(Integer[] heap,int i, int size){
        if ((2*i<size) && heap[2*i]<heap[2*i+1] && heap[2*i]<heap[i]) {
            int swap = heap[i]; heap[i] = heap[2*i];heap[2*i]=swap; sink(heap,2*i, );
        }
        if ((2*i+1<size) && heap[2*i]>heap[2*i+1] && heap[2*i+1]<heap[i]) {
            int swap = heap[i]; heap[i] = heap[2*i+1];heap[2*i+1]=swap; sink(heap,2*i+1);
        }
        System.out.println("Sinking Complete");
    }
    public void insert(int in){
        if (size<heap.length-1) {
            heap[++size] = in; swim(size); System.out.println(in+" has ben inserted."); return;
        } System.out.println("Heap full.");
    }
    public int extractMin(){
        int R = heap[1];
        heap[1]=heap[size]; heap[size] = null;size--; sink(heap,1);
        return R;
    }
    public Integer[] heapsort(){

        Integer arr [] = new Integer[heap.length];
        int S = size; for(int i=1; i<S; i++){arr[i]=heap[i];}

        while (S>1) {
            int copy = arr[S];
            arr[S--] = arr[1]; arr[1]=copy; sink(arr,1); 
        }

        return arr;
    }
}
