
public class SelectionSort {
	/** The method for sorting the numbers */
	public static	int countSwap=0;
	public static	int countMatch=0;
	public static void selectionSort(int[] list) { //int[] list?
		

		for (int i = 0; i < list.length -1; i++) {
			// Find the minimum in the list[i..list.length-1]
			int currentMin = list[i];
			int currentMinIndex = i;
			
			for (int j = i+1; j < list.length; j++) {
				if (currentMin > list[j]) {
					currentMin = list[j];
					currentMinIndex = j;
					SelectionSort.countMatch++;
				}
			}
			
			//	Swap list[i] wiht list[currentMinIndex[ if necessary
			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
				SelectionSort.countSwap++;
			}
		}
	}
	
	  static int minMoves(int arr[], int n)
	    {
	       
	        int expectedItem = n;
	     
	        // Traverse array from end
	        for (int i = n - 1; i >= 0; i--)
	        {
	            // If current item is at its correct position,
	            // decrement the expectedItem (which also means
	            // decrement in minimum number of moves)
	            if (arr[i] == expectedItem)
	                expectedItem--;
	        }
	     
	        return expectedItem;
	    }
	     
	
}