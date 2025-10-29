// Program: Bubble Sort Algorithm  
// Topic: Sorting Algorithms (Arrays)  
// Description: Reads an array of integers from user input and sorts it in ascending order using the Bubble Sort technique.  
// Demonstrates nested loop structure for pairwise comparison and swapping of adjacent elements to achieve sorting.
package Sorting;
import java.util.*;
/**
 *
 * @author Samim
 */
public class BubbleSort 
{
    public void sort(int ar[],int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(ar[j+1]<ar[j])
                {
                    int temp=ar[j+1];
                    ar[j+1]=ar[j];
                    ar[j]=temp;
                }
            }
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
        
        BubbleSort obj=new BubbleSort();
        obj.sort(ar, size);
    }
}
