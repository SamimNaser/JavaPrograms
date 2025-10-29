// Program: Display Even Elements in a 2D Array  
// Topic: 2D Arrays and Conditional Logic  
// Description: Reads elements into a 3x3 integer matrix and prints only the even numbers.  
// Demonstrates nested loops, array traversal, and use of conditional statements to filter values.
package Array2D;
import java.util.*;
/**
 *
 * @author Samim
 */
public class EvenElement 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);  
        int ar[][]=new int [3][3];
        
        //Taking Input Of Elemnets 
        System.out.println("Enter The Elements :");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)  
            {
                ar[i][j]=sc.nextInt();
            }
        }
               System.out.println("Enter The Number :");
               System.out.println("     ");
        
            
        //Printing Even Elements 
        System.out.println("Even Elements :");
        for (int[] ar1 : ar) {
            for (int j = 0; j<ar1.length; j++) {
                if (ar1[j] % 2 == 0) {
                    System.out.println(ar[j]);
                }
            }
        }
    }
}
