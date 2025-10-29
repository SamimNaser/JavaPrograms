// Program: Replace Negative Elements in a 2D Array with Zero  
// Topic: 2D Arrays and Conditional Logic  
// Description: Reads a 2x2 integer matrix from user input, replaces all negative elements with zero,  
// and prints the modified matrix. Demonstrates nested loops and conditional element updates.
package Array2D;
import java.util.*;
/**
 *
 * @author Samim
 */
public class ElementSwap 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);  
        int ar[][]=new int [2][2];
        
        for(int i=0;i<ar.length;i++)
        {
            for(int j=0;j<ar.length;j++)
            {
                ar[i][j]=sc.nextInt();
            }
        }
        
        //Replacing (-)ve Element with 0
        for(int i=0;i<ar.length;i++)
        {
            for(int j=0;j<ar.length;j++)
            {
                if(ar[i][j]<0)
                {
                    ar[i][j]=0;
                }
            }
        }
        
        //PRinting New Array
        for(int i=0;i<ar.length;i++)
        {
            for(int j=0;j<ar.length;j++)
            {
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
    }
}
