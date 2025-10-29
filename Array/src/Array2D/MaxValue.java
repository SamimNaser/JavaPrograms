// Program: Find Maximum Value in a 2D Array  
// Topic: 2D Arrays  
// Description: Reads elements into a 2x2 integer matrix, displays the matrix, and finds the largest element.  
// Demonstrates nested loops, enhanced for-loops, and comparison logic to identify the maximum value.
package Array2D;
import java.util.*;
/**
 *
 * @author Samim
 */
public class MaxValue 
{
    public static int[][] input()
    {
        int ar[][]=new int[2][2];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                ar[i][j]=sc.nextInt();
            }
        }
        return ar;
    }
    public static void main(String args[])
    {
        int ar[][]=input();
        int MaxValue=ar[0][0];
        
        for(int[]row:ar)
        {
            for(int element :row)
            {
                if(element >MaxValue)
                {
                    MaxValue=element;
                }
            }
        }
for(int i=0;i<2;i++)
{
    for(int j=0;j<2;j++)
    {
        System.out.print(ar[i][j]+" ");
    }
    System.out.println();
}
        System.out.println("Max Value :"+MaxValue);
    }
}
