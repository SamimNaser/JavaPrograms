// Program: Selection Sort in Descending Order  
// Topic: Sorting Algorithms (Arrays)  
// Description: Reads an array of integers from user input and sorts it in descending order using the Selection Sort algorithm.  
// In each iteration, the algorithm finds the maximum element in the unsorted part of the array and swaps it with the current position,  
// then displays the sorted array.
package Sorting;
import java.util.*;
/**
 *
 * @author Bankra DQ
 */
public class SelectionSort2 //Descending Sort
{
    public void sort(int ar[],int n)
    {
       int max; 
        for(int i=0;i<n;i++)
        {
            max = i; 
            for(int j=i+1;j<n;j++)
            {
                if(ar[max]<ar[j])
                {
                    max=j;
                }
               
            }
             int temp=ar[max];
                ar[max]=ar[i];
                ar[i]=temp;
        }
        System.out.println("Sorted Array :");
        for(int i=0;i<n;i++)
        {
            System.out.println(ar[i]);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.println("Enter Number oF Elements :");
        size=sc.nextInt();
        int ar[]=new int [size];
        System.out.println("Enter The Elements Of the Array :");
        for(int i=0;i<size;i++)
        {
            ar[i]=sc.nextInt();
        }
        
        SelectionSort2 obj=new SelectionSort2();
        obj.sort(ar, size);
    }
}
