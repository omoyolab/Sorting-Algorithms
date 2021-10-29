import java.util. *;
import java.io.*;


public class ProjectDriver {
	@SuppressWarnings("static-access")
	public static void main(String args[]) throws FileNotFoundException{
		
		Random rd = new Random();
		
		SelectionSort SelectionSortObject = new SelectionSort();
		
		InsertionSort InsertionSortObject = new InsertionSort();
		MergeSort MergeSortObject = new MergeSort();
		QuickSort QuickSortObject = new QuickSort();
		Heap HeapSortObject = new Heap();
		RadixSort RadixSortObject = new RadixSort();
		
		Integer[] list = new Integer [50000];
		for (int i = 0; i< list.length; i++)
			 list[i] = rd.nextInt(100000) +1;
		
		
		
		int[] arr = new int [50000];
		for (int i = 0; i < arr.length; i++)
			arr[i] = rd.nextInt(100000) + 1;
		
		
		
		
		
		System.out.println("SORTING WITH RANDOM NUMBERS ");
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(list));
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		 
		long start1 = System.nanoTime();
		SelectionSortObject.selectionSort(arr);
		long end1 = System.nanoTime();
		System.out.println(Arrays.toString(arr));
		System.out.println("Elapsed Time in nano seconds For Selection Sort: "+ (end1-start1));
		System.out.println("Number of Movements: "+SelectionSortObject.countSwap);
		System.out.println("Number of Comparisons: "+SelectionSortObject.countMatch);
		System.out.println();
		
		long start2 = System.nanoTime();
		HeapSortObject.sort(list);
		long end2 = System.nanoTime(); 
		System.out.println(Arrays.toString(list));
		System.out.println("Elapsed Time in nano seconds For Heap Sort: "+ (end2-start2));
		System.out.println("Number of Movements: "+HeapSortObject.countSwap);
		System.out.println("Number of Comparisons: "+HeapSortObject.countMatch);
		System.out.println();
		
		long start3 = System.nanoTime();
		InsertionSortObject.insertionSort(arr);
		long end3 = System.nanoTime();
		System.out.println(Arrays.toString(arr));
		System.out.println("Elapsed Time in nano seconds For Insertion Sort: "+ (end3-start3));
		System.out.println("Number of Movements: "+ InsertionSortObject.countSwap );
		System.out.println("Number of Comparisons: "+ InsertionSortObject.countMatch);
		System.out.println();
		
		
		long start4 = System.nanoTime();
		MergeSortObject.mergeSort(arr);
		long end4 = System.nanoTime();
		System.out.println(Arrays.toString(arr));
		System.out.println("Elapsed Time in nano seconds For Merge Sort: "+ (end4-start4));
		System.out.println("Number of Movements: "+MergeSortObject.countSwap);
		System.out.println("Number of Comparisons: "+MergeSortObject.countMatch);
		System.out.println();
		
		 
		long start5 = System.nanoTime();
		QuickSortObject.quickSort(arr);
		long end5 = System.nanoTime();
		System.out.println(Arrays.toString(arr));
		System.out.println("Elapsed Time in nano seconds For Qiuck Sort: "+ (end5-start5));
		System.out.println("Number of Movements: "+QuickSortObject.countSwap);
		System.out.println("Number of Comparisons: "+QuickSortObject.countSwap);
		System.out.println();
		
		long start7 = System.nanoTime();
		int x = arr.length;
		RadixSortObject.radixsort(arr, x);
		long end7 = System.nanoTime();
		//RadixSortObject.print(arr, x);
		System.out.println(Arrays.toString(arr));
		System.out.println("Elapsed Time in nano seconds For Radix Sort: "+ (end7-start7));	
		System.out.println("Number of Movements: "+RadixSortObject.countSwap);
		System.out.println("Number of Comparisons: "+RadixSortObject.countMatch );
		System.out.println();
	
		
		System.out.println("SORTING WITH IN-ORDER NUMBERS ");
	     
		int [] inorderArray = arr.clone();
		Integer [] inorderArrayObject = list.clone();
		System.out.println(Arrays.toString(inorderArray));
		System.out.println(Arrays.toString(inorderArrayObject));
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		long start8 = System.nanoTime();
		SelectionSortObject.selectionSort(inorderArray);
		long end8 = System.nanoTime();
		System.out.println(Arrays.toString(inorderArray));
		System.out.println("Elapsed Time in nano seconds For Selection Sort: "+ (end8-start8));
		System.out.println("Number of Movements: "+SelectionSortObject.countSwap);
		System.out.println("Number of Comparisons: "+SelectionSortObject.countMatch);
		System.out.println();
		
		long start9 = System.nanoTime();
		HeapSortObject.sort(list);
		long end9 = System.nanoTime(); 
		System.out.println(Arrays.toString(inorderArrayObject));
		System.out.println("Elapsed Time in nano seconds For Heap Sort: "+ (end9-start9));
		System.out.println("Number of Movements: "+ HeapSortObject.countSwap);
		System.out.println("Number of Comparisons: "+HeapSortObject.countMatch);
		System.out.println();
		
		long start10 = System.nanoTime();
		InsertionSortObject.insertionSort(inorderArray);
		long end10 = System.nanoTime();
		System.out.println(Arrays.toString(inorderArray));
		System.out.println("Elapsed Time in nano seconds For Insertion Sort: "+ (end10-start10));
		System.out.println("Number of Movements: "+InsertionSortObject.countSwap);
		System.out.println("Number of Comparisons: "+InsertionSortObject.countMatch);
		System.out.println();
		
		long start11 = System.nanoTime();
		MergeSortObject.mergeSort(inorderArray);
		long end11 = System.nanoTime();
		System.out.println(Arrays.toString(inorderArray));
		System.out.println("Elapsed Time in nano seconds For Merge Sort: "+ (end11-start11));
		System.out.println("Number of Movements: "+MergeSortObject.countSwap);
		System.out.println("Number of Comparisons: "+MergeSortObject.countMatch);
		System.out.println();
		 
		long start12 = System.nanoTime();
		QuickSortObject.quickSort(inorderArray);
		long end12 = System.nanoTime();
		System.out.println(Arrays.toString(inorderArray));
		System.out.println("Elapsed Time in nano seconds For Qiuck Sort: "+ (end12-start12));
		System.out.println("Number of Movements: "+QuickSortObject.countSwap);
		System.out.println("Number of Comparisons: "+QuickSortObject.countMatch);
		System.out.println();
		
	
		long start13 = System.nanoTime();
		x = arr.length;
		RadixSortObject.radixsort(arr, x);
		long end13 = System.nanoTime();
		System.out.println(Arrays.toString(arr));
		System.out.println("Elapsed Time in nano seconds For Radix Sort: "+ (end13-start13));	
		System.out.println("Number of Movements: "+RadixSortObject.countSwap);
		System.out.println("Number of Comparisons: "+RadixSortObject.countMatch );
		System.out.println();
		
		System.out.println("SORTING WITH IN-REVERSE NUMBERS ");
		 
		int [] revArray = arr.clone();
		Integer [] revArrayObject = list.clone();
		Arrays.sort(revArrayObject, Collections.reverseOrder());
		reverse(revArray);
		System.out.println(Arrays.toString(revArrayObject));
		System.out.println(Arrays.toString(revArray));
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		long start14 = System.nanoTime();
		SelectionSortObject.selectionSort(revArray);
		long end14 = System.nanoTime();
		System.out.println(Arrays.toString(revArray));
		System.out.println("Elapsed Time in nano seconds For Selection Sort: "+ (end14-start14));
		System.out.println("Number of Movements: "+SelectionSortObject.countSwap);
		System.out.println("Number of Comparisons: "+SelectionSortObject.countMatch);
		System.out.println();
		
		long start15 = System.nanoTime();
		HeapSortObject.sort(revArrayObject);
		long end15 = System.nanoTime(); 
		System.out.println(Arrays.toString(revArrayObject));
		System.out.println("Elapsed Time in nano seconds For Heap Sort: "+ (end15-start15));
		System.out.println("Number of Movements: "+HeapSortObject.countSwap);
		System.out.println("Number of Comparisons: "+HeapSortObject.countMatch);
		System.out.println();
		
		long start16 = System.nanoTime();
		InsertionSortObject.insertionSort(revArray);
		long end16 = System.nanoTime();
		System.out.println(Arrays.toString(revArray));
		System.out.println("Elapsed Time in nano seconds For Insertion Sort: "+ (end16-start16));
		System.out.println("Number of Movements: "+ InsertionSortObject.countSwap );
		System.out.println("Number of Comparisons: "+ InsertionSortObject.countMatch);
		System.out.println();
		
		long start17 = System.nanoTime();
		MergeSortObject.mergeSort(revArray);
		long end17 = System.nanoTime();
		System.out.println(Arrays.toString(revArray));
		System.out.println("Elapsed Time in nano seconds For Merge Sort: "+ (end17-start17));
		System.out.println("Number of Movements: "+MergeSortObject.countSwap);
		System.out.println("Number of Comparisons: "+MergeSortObject.countMatch);
		System.out.println();
		
		long start18 = System.nanoTime();
		QuickSortObject.quickSort(revArray);
		long end18 = System.nanoTime();
		System.out.println(Arrays.toString(revArray));
		System.out.println("Elapsed Time in nano seconds For Qiuck Sort: "+ (end18-start18));
		System.out.println("Number of Movements: "+QuickSortObject.countSwap);
		System.out.println("Number of Comparisons: "+QuickSortObject.countSwap);
		System.out.println();
		
		
		

		long start19 = System.nanoTime();
			x = arr.length;
		RadixSortObject.radixsort(arr, x);
		long end19 = System.nanoTime();
		System.out.println(Arrays.toString(arr));
		System.out.println("Elapsed Time in nano seconds For Radix Sort: "+ (end19-start19));	
		System.out.println("Number of Movements: "+QuickSortObject.countSwap);
		System.out.println("Number of Comparisons: "+QuickSortObject.countSwap);
		System.out.println();
		
		System.out.println();
		
	
		System.out.println("SORTING WITH HALF-SORTED NUMBERS ");
		int[] halfSortedArray= arr.clone();
		halfSortedArray=halfSortOne(halfSortedArray);
		Integer [] halfSortedArrayObject = list.clone();
		halfSortedArrayObject=halfSortOne(halfSortedArrayObject);
		System.out.println(Arrays.toString( halfSortedArrayObject));
		System.out.println(Arrays.toString(revArray));
					
					
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
					
		long start20 = System.nanoTime();
		SelectionSortObject.selectionSort(halfSortedArray);
		long end20 = System.nanoTime();
		System.out.println(Arrays.toString(revArray));
		System.out.println("Elapsed Time in nano seconds For Selection Sort: "+ (end20-start20));
		System.out.println("Number of Movements: "+SelectionSortObject.countSwap);
		System.out.println("Number of Comparisons: "+SelectionSortObject.countMatch);
		System.out.println();

		long start21 = System.nanoTime();
		HeapSortObject.sort(halfSortedArrayObject);
		long end21 = System.nanoTime(); 
		System.out.println(Arrays.toString(halfSortedArrayObject));
		System.out.println("Elapsed Time in nano seconds For Heap Sort: "+ (end21-start21));
		System.out.println("Number of Movements: "+HeapSortObject.countSwap);
		System.out.println("Number of Comparisons: "+HeapSortObject.countMatch);
		System.out.println();			
		
		
		long start24 = System.nanoTime();
		InsertionSortObject.insertionSort(halfSortedArray);
		long end24 = System.nanoTime();
		System.out.println(Arrays.toString(halfSortedArray));
		System.out.println("Elapsed Time in nano seconds For Insertion Sort: "+ (end24-start24));
		System.out.println("Number of Movements: "+ InsertionSortObject.countSwap );
		System.out.println("Number of Comparisons: "+ InsertionSortObject.countMatch);
		System.out.println();

		long start22 = System.nanoTime();
		MergeSortObject.mergeSort(halfSortedArray);
		long end22 = System.nanoTime();
		System.out.println(Arrays.toString(halfSortedArray));
		System.out.println("Elapsed Time in nano seconds For Merge Sort: "+ (end22-start22));
		System.out.println("Number of Movements: "+MergeSortObject.countSwap);
		System.out.println("Number of Comparisons: "+MergeSortObject.countMatch);
		System.out.println();	

		long start23 = System.nanoTime();
		QuickSortObject.quickSort(halfSortedArray);
		long end23 = System.nanoTime();
		System.out.println(Arrays.toString(halfSortedArray));
		System.out.println("Elapsed Time in nano seconds For Qiuck Sort: "+ (end23-start23));
		System.out.println("Number of Movements: "+QuickSortObject.countSwap);
		System.out.println("Number of Comparisons: "+QuickSortObject.countSwap);
		System.out.println();
	
		long start25 = System.nanoTime();
		HeapSortObject.sort(revArrayObject);
		long end25 = System.nanoTime(); 
		System.out.println("Elapsed Time in nano seconds For Heap : "+ (end25-start25));
		
		long start26 = System.nanoTime();
		x = halfSortedArray.length;
		RadixSortObject.radixsort(halfSortedArray, x);
		long end26 = System.nanoTime();
		System.out.println(Arrays.toString(halfSortedArray));
		System.out.println("Elapsed Time in nano seconds For Radix Sort: "+ (end26-start26));	
		System.out.println("Number of Movements: "+RadixSortObject.countSwap);
		System.out.println("Number of Comparisons: "+RadixSortObject.countMatch );
		System.out.println();

	}
	public static Integer[] halfSortOne(Integer [] arr) {
		int n = arr.length;
		 Arrays.sort(arr, 0, n / 2);
	     Arrays.sort(arr, n / 2, n, Collections.reverseOrder());
		 return arr;
	}
	
	public static int[] halfSortOne(int [] arr) {
		int n = arr.length;
		 Arrays.sort(arr, 0, n / 2);
		 return arr;
	}

	
	
	public static void reverse(int[] input) { 
		int last = input.length - 1; 
		int middle = input.length / 2; 
		for (int i = 0; i <= middle; i++) { 
			int temp = input[i]; 
			input[i] = input[last - i]; 
			input[last - i] = temp; } 
		}


}
