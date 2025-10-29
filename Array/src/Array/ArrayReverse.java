// Program: Display Array in Original and Reverse Order  
// Topic: Arrays  
// Description: Stores integers in an array, prints them in normal order, then prints them in reverse order  
// using an enhanced for loop and index-based access to demonstrate array traversal techniques.
package Array;
/**
 *
 * @author Samim
 */
public class ArrayReverse {
    public static void main(String args[]){
        int ar[]={1,2,3,4,5};
        
        System.out.println("Array in original order :");
        for(int t:ar){
            System.out.println(t);
        }
        
        System.out.println("Array in reverse order :");
        int i = ar.length-1;
        for(int e: ar){
            System.out.println(ar[i]);
            i--;
        }
    }
}
