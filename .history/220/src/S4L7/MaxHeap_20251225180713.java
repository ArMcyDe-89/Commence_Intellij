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
        if(2*i>S){System.out.println("Nowhere to go."); return;}
        int big = 2*i;
        if(2*i+1<=S && heap[2*i+1]>heap[2*i]){big = 2*i+1;}
        if(heap[big]>heap[i]){int swap = heap[big]; heap[big]= heap[i]; heap[i] = swap; sink(A, big, S);}
    }
    public Integer[] heapsort(Integer[] A, int size){
        Integer copy [] = new Integer[A.length]; int S = size;
        for(int i = 1; i<=S; i++){copy[i]=A[i];}
        while(S>1){
            int swap = copy[S];
            copy[S] = copy[1]; copy[1] = swap; sink(copy, 1, S);
        }
        return copy;
    }
}
