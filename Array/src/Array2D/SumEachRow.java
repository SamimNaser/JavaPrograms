// Program: Calculate Sum of Each Row in a 2D Array  
// Topic: 2D Arrays and Loops  
// Description: Reads a 4x4 integer matrix from user input, then calculates and displays  
// the sum of elements in each row using nested loops.
package Array2D;
import java.util.*;
/**
 *
 * @author Samim
 */
public class SumEachRow 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in); 
        int ar[][]=new int [4][4];
        
        for (int[] ar1 : ar) {
            for (int j = 0; j<ar.length; j++) {
                ar1[j] = sc.nextInt();
            }
        }
        
        //Printing Sum Of Each Row 
        for(int i=0;i<ar.length;i++)
        {
            int sum=0;
            for(int j=0;j<ar.length;j++)
            {
                sum+=ar[i][j];
            }
            System.out.println("Sum Of Row :"+(i+1)+" "+sum);
        }
    }
}
