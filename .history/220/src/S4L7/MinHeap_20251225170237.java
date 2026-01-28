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
        int small; if(heap[2*i]<heap[2*i+1]){small = 2*i;}else{small = 2*i+1;}
        if(i<size && heap[small]<heap[i]){
            int swap = heap[small]; heap[small]=heap[i]; heap[i]=swap; sink(heap, i, size);
            System.out.println("Sinking Complete");
        }
        
    }
    public void insert(int in){
        if (size<heap.length-1) {
            heap[++size] = in; swim(size); System.out.println(in+" has ben inserted."); return;
        } System.out.println("Heap full.");
    }
    public int extractMin(){
        int R = heap[1];
        heap[1]=heap[size]; heap[size] = null;size--; sink(heap,1,size);
        return R;
    }
    public Integer[] heapsort(){

        Integer arr [] = new Integer[heap.length];
        int S = size; for(int i=1; i<=S; i++){arr[i]=heap[i];}

        while (S>1) {
            int copy = arr[S];
            arr[S--] = arr[1]; arr[1]=copy; sink(arr,1,S); 
        }

        return arr;
    }
}
