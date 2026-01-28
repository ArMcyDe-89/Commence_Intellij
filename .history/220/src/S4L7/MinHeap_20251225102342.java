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
            int swap = heap[i]; heap[i] = heap[2*i];heap[2*i]=swap; sink(2*)
        }
        if ((i<size) && heap[i]<heap[2*i+1]) {
            int swap = heap[i]; heap[i] = heap[2*i+1];heap[2*i+1]=swap;
        }
    }
}
