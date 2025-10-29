// Program: Swap First and Last Rows of a 3x3 Matrix  
// Topic: 2D Arrays and Array Manipulation  
// Description: Reads elements into a 3x3 matrix, swaps the first row with the last row,  
// and prints the updated matrix. Demonstrates basic 2D array operations and element swapping using nested loops.
package Array2D;
import java.util.*;
/**
 *
 * @author Samim
 */
public class SwapRow 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);  
        int ar[][]=new int [3][3];
        
        System.out.println("Enter Elements At :");
        for(int i=0;i<ar.length;i++)
        { 
            for(int j=0;j<ar.length;j++)
            {
                System.out.println("At Index arr["+i+"]["+j+"]");
                ar[i][j]=sc.nextInt();
            }
        }
        
        //Swapping Last Row with First Row 
            for(int j=0;j<ar.length;j++)
            {
                int temp=ar[0][j];
                
                ar[0][j]=ar[ar.length-1][j];
                ar[ar.length-1][j]=temp;
            }
        
        
        //Printing New Array
        for (int[] ar1 : ar) {
            for (int j = 0; j<ar.length; j++) {
                System.out.print(ar1[j] + " ");
            } 
            System.out.println();
        }
    }
}
