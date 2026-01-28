public class Runner {
    public static void main(String[] args) {
System.out.println("--- 1. Testing Constructor & Insert ---");
        // Capacity of 10
        MinHeap mh = new MinHeap(10);

        // Inserting numbers in random order to test 'swim'
        // Expected MinHeap order (logical): 2 at root, others below
        int[] inputs = {15, 2, 8, 40, 5, 20};
        
        for (int num : inputs) {
            mh.insert(num);
        }
        
        // Helper to peek inside (assuming you can access heap or just trusting behavior)
        System.out.println("Insertions complete.");


        System.out.println("\n--- 2. Testing extractMin() ---");
        // We expect '2' to come out first
        int min = mh.extractMin();
        System.out.println("Extracted Min: " + min);
        
        if (min == 2) {
            System.out.println("SUCCESS: Correct minimum extracted.");
        } else {
            System.out.println("FAILURE: Wrong minimum.");
        }


        System.out.println("\n--- 3. Testing heapsort() ---");
        // The heap currently has {5, 8, 15, 20, 40} (logic may vary slightly on structure but 5 is new min)
        // Heapsort on MinHeap (using your swap-to-end logic) produces DESCENDING order.
        
        Integer[] sortedResult = mh.heapsort();
        
        System.out.print("Sorted Array (Copy): ");
        printArray(sortedResult);
        
        // Check if it is descending
        boolean isDescending = true;
        // Start loop at 1 because index 0 is null/empty
        for (int i = 1; i < sortedResult.length - 1; i++) {
            if (sortedResult[i+1] != null && sortedResult[i] < sortedResult[i+1]) {
                isDescending = false;
                break;
            }
        }
        
        if (isDescending) {
            System.out.println("SUCCESS: Array is sorted Descending.");
        } else {
            System.out.println("FAILURE: Array is not sorted correctly.");
        }


        System.out.println("\n--- 4. Verify Original Heap Integrity ---");
        // We need to make sure heapsort() didn't destroy the class's internal heap.
        // If we extract min again, we should get the next smallest number (5).
        
        int nextMin = mh.extractMin();
        System.out.println("Extracted next min from original heap: " + nextMin);
        
        if (nextMin == 5) { // 5 was the next smallest after 2
            System.out.println("SUCCESS: Original heap is still functional!");
        } else {
            System.out.println("FAILURE: Original heap was damaged or out of order.");
        }
    }

    // Helper method to print the array cleanly (skipping index 0)
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
