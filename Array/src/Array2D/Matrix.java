// Program: Input and Display Elements of a 2x3 Matrix  
// Topic: 2D Arrays  
// Description: Reads elements into a 2x3 integer matrix from user input and then displays them.  
// Demonstrates basic input, storage, and traversal of two-dimensional arrays using nested loops.
package Array2D;
import java.util.*;
/**
 *
 * @author Samim
 */
public class Matrix
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int ar[][]=new int[2][3];
        System.out.println("Enter The Elements :");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                ar[i][j]=sc.nextInt();
            }
        }
        
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)

            {
                ar[i][j]=sc.nextInt();
                
            }
        }
    }
}
