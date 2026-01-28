public class MinHeap {
    int[] heap;
    int size;
    public MinHeap(){
    }
    public MinHeap(int capacity){
        heap = new int[capacity]; size =0;
    }
    public void swim(int i){
        if((i>1)&&(heap[i/2]<heap[i])){
            int swap = heap[i]; heap[i] = heap[i/2]; heap[i/2] = swap; swim(i/2);
        }
    }
    public void sink(int i){
        if ((i<size) && heap[i]<heap[2*i]) {
            int swap = heap[i]
        }
    }
}
