
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        taskPrint("\n====================== TASK#3 =====================");
        System.out.println("How many machines will there be?"); int m = sc.nextInt();
        Integer [] tasks = new Integer[m+1];
        for(int i =0;i<tasks.length;i++){
            System.out.print("Please enter the load of task - "+i+1+": "); tasks[i]=sc.nextInt();
            System.out.println();
        }
        MinHeap mini = new MinHeap(m);
        for(int i =0; i<m;i++){mini.insert(0);}
        for(int i =0; i<tasks.length;i++){
            mini.insert(tasks[i]+mini.extractMin());
        }
        Integer sorted = mini.heapsort();

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
