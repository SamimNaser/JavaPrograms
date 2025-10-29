// Program: Binary Search Implementation  
// Topic: Searching Algorithms (Arrays)  
// Description: Performs binary search on a sorted integer array to find the position of a given element.  
// Uses iterative logic to repeatedly divide the search interval in half until the element is found or not present.
package Searching;
import java.util.*;
/**
 *
 * @author Samim
 */
public class BinarySearch 
{
    public int searching(int ar[], int search)
    {
        int high=ar.length-1;
        int low=0;         
        int flag=0;
        while(low<=high)
        {  
            int mid=(high+low)/2;
            
            if(ar[mid]==search)
            {
                flag=mid+1;
                break;
            }
            else if(ar[mid]<search)
            {
                low=mid+1;
            }
            else if(ar[mid]>search)
            {
                high=mid-1;
            }
          
        }
        return flag;
    }
    public void display(int flag)
    {
        if(flag!=0)
        {
            System.out.println("Element Found at position:"+flag);
        }
        else
        {
            System.out.println("Element Not Found");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[10];
        int search;
        
        System.out.println("Enter The Elements Of Array :");
        for(int i=0;i<10;i++)
        {
            ar[i]=sc.nextInt();
        }
        System.out.println("Enter Search Element :");
        search=sc.nextInt();
        
        BinarySearch obj=new BinarySearch();
        int p=obj.searching(ar,search);
        obj.display(p);
    }  
}
