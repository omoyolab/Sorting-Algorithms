public class Heap{

	public static int countSwap=0;
	public static int countMatch=0;
    public static void sort(Integer[] list)
    {
        int n = list.length;
 
        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(list, n, i);
 
        // One by one extract an element from heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = list[0];
            list[0] = list[i];
            list[i] = temp;
 
            // call max heapify on the reduced heap
            heapify(list, i, 0);
        }
    }
 
    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
  public static  void  heapify(Integer[] list, int n, int i)
    {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2
 
        // If left child is larger than root
        if (l < n && list[l] > list[largest]){
            largest = l;
			Heap.countMatch++;
 			}
        // If right child is larger than largest so far
        if (r < n && list[r] > list[largest]){
            largest = r;
			Heap.countMatch++;
 		}
        // If largest is not root
        if (largest != i) {
            int swap = list[i];
            list[i] = list[largest];
            list[largest] = swap;
			Heap.countSwap++;
            // Recursively heapify the affected sub-tree
            heapify(list, n, largest);
        }
    }
 
    /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
 
  
}