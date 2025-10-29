// Program: Selection Sort Algorithm  
// Topic: Sorting Algorithms (Arrays)  
// Description: Implements the Selection Sort technique to arrange an array of integers in ascending order.  
// Iteratively finds the minimum element from the unsorted part of the array and swaps it with the first unsorted element.  
// Displays the sorted array at the end.
package Sorting;
import java.util.*;
/**
 *
 * @author Samim
 */
public class SelectionSort //Ascending Sort
{
    public void sort(int ar[],int n)
    {
       int min; 
        for(int i=0;i<n;i++)
        {
            min = i;
            for(int j=i+1;j<n;j++)
            {
                if(ar[j]<ar[min])
                {
                    min=j;
                }
            }
            int temp=ar[min];
                ar[min]=ar[i];
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
        
        SelectionSort obj=new SelectionSort();
        obj.sort(ar, size);
    }
}
