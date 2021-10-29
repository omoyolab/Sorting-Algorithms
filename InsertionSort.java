
public class InsertionSort {
	/**The method for sorting the numbers */
	public static int countSwap=0;
	public static int countMatch=0;
	public static void insertionSort(int[] list) {
	
		for (int i = 1; i < list.length; i++) {
			/** Insert list[i] into a sorted sublist list[0..i-1] so that 
			 * 	list[0..i] is sorted
			 */
			int currentElement = list[i];
			int k;
			for (k = i-1; k>= 0 && list[k] > currentElement; k--) {

				list[k+1] = list[k];
				InsertionSort.countMatch++;
				
			}
			InsertionSort.countMatch++;
			//insert the current element into list[k + 1]
			list[k + 1] = currentElement;
			InsertionSort.countSwap++;
		}
		
	}
}