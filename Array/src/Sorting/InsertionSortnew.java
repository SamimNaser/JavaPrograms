// Program: Insertion Sort Implementation  
// Topic: Sorting Algorithms (Arrays)  
// Description: Demonstrates the Insertion Sort algorithm to arrange an array of integers in ascending order.  
// Elements are compared and inserted into their correct position one by one.  
// Includes a helper method to print the array before and after sorting.
package Sorting;

/**
 *
 * @author Samim
 */

// Java program for implementation of Insertion Sort 
class InsertionSortnew { 
	// Function to sort array using insertion sort 
	void sort(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i = 1; i < n; i++) { 
			int key = arr[i]; 
			int j = i - 1;
			while (j >= 0 && arr[j] > key) { 
                              //System.out.println(i+" "+j);

				arr[j + 1] = arr[j]; 
				j = j - 1; 
                              //printArray(arr);   
			} 
			arr[j + 1] = key; 
		} 
	} 

	// A utility function to print array of size n 
        void printArray(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i = 0; i < n; ++i) 
			System.out.print(arr[i] + " "); 

		System.out.println(); 
	} 

	// Driver method 
	public static void main(String args[]) 
	{ 
		int arr[] = {85, 12, 59, 45,72, 51 }; 

		InsertionSortnew ob = new InsertionSortnew(); 
                
		ob.sort(arr);
		ob.printArray(arr); 
	} 
}
