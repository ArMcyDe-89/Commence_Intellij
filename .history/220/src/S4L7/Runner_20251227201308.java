
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // taskPrint("\n====================== TASK#3 =====================");
        // System.out.print("How many machines will there be?"); int m = sc.nextInt(); System.out.println();
        // Integer [] tasks = new Integer[m+1];
        // for(int i =0;i<tasks.length;i++){
        //     System.out.print("Please enter the load of task - "+(i+1)+": "); tasks[i]=sc.nextInt();
        //     System.out.println();
        // }
        // MinHeap mini = new MinHeap(m);
        // for(int i =0; i<m;i++){mini.insert(0);}
        // for(int i =0; i<tasks.length;i++){
        //     mini.insert(tasks[i]+mini.extractMin());
        // }
        // Integer[] sortedResult = mini.heapsort();
        // Integer [] print = new Integer[sortedResult.length];
        // for(int i = print.length-1, j=0; i>0 && j< print.length;i-- ,j++){print[j]=sortedResult[i];}
        // System.out.print("Sorted Array (Copy): ");
        // printArray(print);


        // taskPrint("\n====================== TASK#4 =====================");
        // Integer [] nums = {4, 10, 2, 8, 6, 7};
        // System.out.print("Please enter the number of elements to be extracted :"); int k = sc.nextInt(); System.out.println();
        // if(k>nums.length){while(true){
        //     System.out.print("Please enter a number smaller than the length of nums :"); k =sc.nextInt();
        //     if(k<=nums.length){break;} System.out.println();}
        // }
        // Integer [] biggest = new Integer[k];
        // MaxHeap max = new MaxHeap(nums.length);
        // for(int i = 0;i<nums.length;i++){max.insert(nums[i]);}
        // for(int i=0; i<k;i++){biggest[i]=max.extractMax();}
        // System.out.println("The biggest elemnts are:"); printArray(biggest);


        taskPrint("\n====================== TASK#5 =====================");

        String [] task_names = {"Email", "Meeting", "Code Review", "Lunch", "Debug"}; Integer [] priorities = {2, 5, 3, 1, 4};
        
        MaxHeap Scheduler = new MaxHeap(priorities.length);
        for(int i = 0; i<priorities.length;i++){Scheduler.insert(task_names);}


    }
    static final String green = "\u001B[32m", red = "\u001B[31m", white = "\u001B[37m", cyan = "\033[0;96m";
    static final String bold="\u001B[1m", underline = "\u001B[4m", normal = "\033[0;0m";
    
    static String taskFormat = cyan;
    static String sucsFormat = "\n"+green+bold+underline;
    static String failFormat = "\n"+red+bold+underline;
    static String endFormat = normal+white;

    private static void taskPrint(String task){
        System.out.println(taskFormat+task+endFormat);
    }
    private static void printArray(Integer[] arr) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            // We print index 0 as "null" or skip it, but let's show everything for clarity
            if (arr[i] != null) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println("]");
    }
}
