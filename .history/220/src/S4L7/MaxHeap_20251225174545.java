public class MaxHeap {
    private Integer [] heap;
    private int size;
    public MaxHeap(){}
    public MaxHeap(int capacity){
        heap= new Integer[capacity+1]; size = 0;
    }
    public void swim(Integer [] A, int i){
        if (i>1 && A[i/2]<A[i]) {
            int swap = A[i]; A[i] = A[i/2]; A[i/2] = swap; swim(A,i/2); 
        }
    }
    public void insert(int in){
        if (size<heap.length-1) {
            heap[++size] = in; swim(heap,size); return;
        } System.out.println("Heap is Full.");
    }
    public int extractMax(){
        int R = heap[1];
        heap[1] = heap[size]; heap[size] = null;size--; sink(heap,1,size);
        return R; 
    }
    public void sink(Integer [] A, int i, int S){
        if(2*i>size){System.out.println("Nowhere to go."); return;}
        int big = 2*i;
        if(2*i+1<=size && heap[2*i+1]>){}
    }
}
