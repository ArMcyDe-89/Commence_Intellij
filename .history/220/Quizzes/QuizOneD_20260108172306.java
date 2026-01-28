public class QuizOneD {
    public  Node awardFastPass( Node head){
        int n = countNodes(head);
        int l=0; Node N = head;
        if(n%2==0){l=(n/2)+1;}else{l=n/2;} n =0;
        while(N!=null){
            if(n==l){break;}
            N=N.next;
        }return N;
    }
    public Integer countNodes(Node head){
        if(head==null){return  0;}
        return 1 + countNodes(head.next);
    }
}
