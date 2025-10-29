// Program: Input and Display 2D Array Elements  
// Topic: 2D Arrays  
// Description: Reads elements into a 2x2 integer array from user input and then displays them in matrix format.  
// Demonstrates basic array traversal using nested loops for two-dimensional arrays.
package Array2D;
import java.util.*;
/**
 *
 * @author Samim
 */
public class ArrayNew 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int ar[][]=new int[2][2];
        System.out.println("Enter The elements :");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                ar[i][j]=sc.nextInt();
            }
        }
        System.out.println("Array :");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.println(ar[i][j]);
                System.out.println("");
            }
        }
    }
}
