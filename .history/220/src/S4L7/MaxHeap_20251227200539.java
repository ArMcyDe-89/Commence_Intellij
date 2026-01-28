public class MaxHeap {
    private String [] tasks;
    private Integer [] heap;
    private int size;
    public MaxHeap(){}
    public MaxHeap(int capacity){
        heap= new Integer[capacity+1]; tasks = new String[capacity+1]; size = 0;
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
        if(2*i>S){return;}
        int big = 2*i;
        if(2*i+1<=S && A[2*i+1]>A[2*i]){big = 2*i+1;}
        if(A[big]>A[i]){int swap = A[big]; A[big]= A[i]; A[i] = swap; sink(A, big, S);}
    }
    public Integer[] heapsort(){
        Integer copy [] = new Integer[heap.length]; int S = size;
        for(int i = 1; i<=S; i++){copy[i]=heap[i];}
        while(S>1){
            int swap = copy[S];
            copy[S--] = copy[1]; copy[1] = swap; sink(copy, 1, S);
        }
        return copy;
    }

    //For task - 5
    public void swim(String [] T,Integer [] A, int i){
        if (i>1 && A[i/2]<A[i]) {
            int swap = A[i]; A[i] = A[i/2]; A[i/2] = swap;
            String S = T[i]; T[i] = T[i/2]; T[i/2] = S;
            swim(T,A,i/2); 
        }
    }
    public void insert(String task, int in){
        if (size<heap.length-1) {
            heap[++size] = in; tasks[size] = task;swim(tasks,heap,size); return;
        } System.out.println("Heap is Full.");
    }
    public void sink(String [] T,Integer [] A, int i, int S){
        if(2*i>S){return;}
        int big = 2*i;
        if(2*i+1<=S && A[2*i+1]>A[2*i]){big = 2*i+1;}
        if(A[big]>A[i]){
            int swap = A[big]; A[big]= A[i]; A[i] = swap;
            String C = T[big]; A[big]= A[i]; A[i] = swap;
            sink(A, big, S);
        }
    }
    public Integer[] heapsort(){
        Integer copy [] = new Integer[heap.length]; int S = size;
        for(int i = 1; i<=S; i++){copy[i]=heap[i];}
        while(S>1){
            int swap = copy[S];
            copy[S--] = copy[1]; copy[1] = swap; sink(copy, 1, S);
        }
        return copy;
    }

}
