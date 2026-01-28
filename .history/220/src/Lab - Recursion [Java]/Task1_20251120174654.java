import java.util.Scanner;

public class Task1 {

    // Task 1A: Print numbers from 1 to 10 using a loop
    public static void task1A() {
        int i = 1;
        while (i<10) {
            System.out.println(i);
        }
        // TODO: Implement this using a loop
    }

    // Task 1B: Print numbers from 1 to 10 using recursion
    public static void task1B_recursive(int i) {
        if (i == 1) {
            System.out.println(i); return;
        }
        task1B_recursive(i-1); 
        System.out.println(i);
        // TODO: Implement this recursively
    }

    // Task 1C: Print numbers from 1 to n using a loop
    public static void task1C(int n) {
        int i = 1;
        while (i<n) {
            System.out.println(i++);
        }
        // TODO: Implement this using a loop
    }

    // Task 1D: Print numbers from 1 to n using recursion
    public static void task1D_recursive(int i, int n) {
        if(n == 1){
            System.out.println(n);return;
        }task1C(n-1); System.out.println(n);
        // TODO: Implement this recursively
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Driver code for testing Task 1 methods
        // Write on your own

        sc.close();
    }
}
