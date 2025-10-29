// Program: Display and Handle Two-Dimensional Array with Exception Handling  
// Topic: 2D Arrays and Exception Handling  
// Description: Demonstrates declaration and traversal of a 2D array.  
// Includes a try-catch block to safely handle ArrayIndexOutOfBoundsException when accessing irregular (jagged) arrays.
package Array2D;
import java.util.*;
/**
 *
 * @author Samim
 */
public class ArraySD 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int sales[][]=new int[2][4];
        int i,j,total;
       try{
           for( i=0;i<2;i++)
           {
               total=0;
               System.out.println("Enter Sales Of Salesman "+(i+1));
               for(j=0;j<4;j++)
               {
                   System.out.println("Month "+(j+1)+" : ");
                   sales[i][j]=sc.nextInt();
                   total=total+sales[i][j];
               }
               System.out.println("Total Sales "+(i+1)+"="+total);
           }
       }
       catch(Exception e){}
int Z[][]={{2,4,57},{2,4}};
        // System.out.println(Z);
        try{
        for(int k=0;k<=1;k++)
        {
            for(int l=0;l<3;l++)
            {
                System.out.print(Z[k][l]+" ");
            }
            System.out.println("");
        }}
        catch(Exception e)
        {
            
        }
    }
}
