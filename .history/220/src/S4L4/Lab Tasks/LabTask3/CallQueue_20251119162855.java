//YOU NEED TO ONLY WRITE THE FOLLOWING METHODS
// enqueueCall()
// dequeueCall()
// displayQueue()
// Inside of these methods you need to utilize the objects of LinkedListQueue class
// vipQueue and regularQueue objects are already created for you
class CallQueue {

    private LinkedListQueue vipQueue;
    // VIP queue
    private LinkedListQueue regularQueue;
    // Regular queue

    //DO NOT CHANGE THIS CONSTRUCTOR
    public CallQueue() {
        this.vipQueue = new LinkedListQueue();
        this.regularQueue = new LinkedListQueue();
    }

    //You have to write this method
    public void enqueueCall(int customerId, boolean isVip) {
        if(isVip){vipQueue.enqueue(customerId);
            System.out.printf("Customer %d added to VIP queue.\n",customerId);
            return;
        }
        regularQueue.enqueue(customerId);
        System.out.printf("Customer %d added to Regular queue.\n",customerId);
        return;
        // To Do
    }

    //You have to write this method
    public void dequeueCall() {
        if(!(vipQueue.isEmpty())){vipQueue.dequeue();
            System.out.println("Processing VIP Customer %d.");return;}
        regularQueue.dequeue();
        // To Do 
    }

    //You have to write this method
    public void displayQueue() {
        System.out.println("VIP Queue");
        vipQueue.displayQueue();
        System.out.println("Regular Queue");
        regularQueue.displayQueue();
        // To Do
    }

}
