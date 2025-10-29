// Program: Binary Search Using Recursion  
// Topic: Recursion and Searching Algorithms  
// Description: Implements the Binary Search algorithm recursively to find a target element in a sorted array.  
// The method `Search()` divides the array into halves at each step and compares the middle element with the search key.  
// Demonstrates recursive function calls, base and recursive conditions, and array traversal for efficient searching.
package recursion;
import java.util.*;
/**
 *
 * @author Samim
 */
public class BinarySearch {
    public static int Search(int high,int low,int search,int a[]){
        
        int mid=(int)((high+low)/2);
        if(low>high){
            return 0;
        }
        if(search > a[high]){
            return 0;
        }
        else if(a[mid]<search){
            return Search(high,mid+1,search,a);
        }
        else if(a[mid]>search){
            return Search(mid-1,low,search,a);
        }
        else{
            return a[mid];
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[5];
        int s;
        
        System.out.println("Enter Elements :");
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }
        System.out.println("Enter Search Value :");
        s=sc.nextInt();
        
        if(Search(ar.length-1,0,s,ar)==s){
            System.out.println("Element Found !");
        }
        else{
            System.out.println("Element Not Found !");
        }
    }
}
