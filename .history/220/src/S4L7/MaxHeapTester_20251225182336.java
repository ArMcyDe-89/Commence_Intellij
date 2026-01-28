public class MaxHeapTester {
    public static void main(String[] args) {
        System.out.println("--- 1. Testing Constructor & Insert ---");
        MaxHeap maxH = new MaxHeap(10);

        // Inserting unsorted numbers
        // MaxHeap logic should bubble the largest number (80) to the top
        int[] inputs = {15, 5, 80, 40, 2, 20};
        
        for (int num : inputs) {
            maxH.insert(num);
            System.out.println("Inserted: " + num);
        }
        
        System.out.println("Insertions complete.");


        System.out.println("\n--- 2. Testing extractMax() ---");
        // We expect '80' to be at the root.
        int max = maxH.extractMax();
        System.out.println("Extracted Max: " + max);
        
        if (max == 80) {
            System.out.println("SUCCESS: Correct maximum extracted.");
        } else {
            System.out.println("FAILURE: Wrong maximum. Expected 80, got " + max);
        }


        System.out.println("\n--- 3. Testing heapsort() ---");
        // The heap currently contains {40, 20, 15, 5, 2} (structure varies, but 40 is new max)
        // MaxHeap Heapsort (swap max to end) results in ASCENDING order (Small -> Large).
        
        // Note: Make sure your heapsort() doesn't require parameters in your final class!
        Integer[] sortedResult = maxH.heapsort();
        
        System.out.print("Sorted Array (Copy): ");
        printArray(sortedResult);
        
        // Check if it is Ascending
        boolean isAscending = true;
        for (int i = 1; i < sortedResult.length - 1; i++) {
            // 1. Safety Check: If current or next slot is null, we reached the end of the data.
            if (sortedResult[i] == null || sortedResult[i+1] == null) {
                break; 
            }
            
            // 2. The actual sort check
            if (sortedResult[i] > sortedResult[i+1]) {
                isAscending = false;
                break;
            }
        }
        
        if (isAscending) {
            printArray(sortedResult);
            System.out.println("SUCCESS: Array is sorted Ascending (Standard MaxHeap Sort).");
        } else {
            System.out.println("FAILURE: Array is not sorted correctly.");
        }


        System.out.println("\n--- 4. Verify Original Heap Integrity ---");
        // We need to make sure heapsort() didn't destroy the class's internal heap.
        // If we extract max again, we should get the next largest number (40).
        
        int nextMax = maxH.extractMax();
        System.out.println("Extracted next max from original heap: " + nextMax);
        
        if (nextMax == 40) { // 40 was the next largest after 80
            printArray(sortedResult);
            System.out.println("SUCCESS: Original heap is still functional!");
        } else {
            printArray(sortedResult);
            System.out.println("FAILURE: Original heap was damaged. Expected 40, got " + nextMax);
        }
    }

    // Helper method to print the array cleanly
    private static void printArray(Integer[] arr) {
        System.out.print("[ ");
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println("]");
    }
}
