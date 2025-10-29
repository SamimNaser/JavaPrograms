// Program: Calculate Total Sales of Each Salesman  
// Topic: 2D Arrays  
// Description: Reads sales data for 2 salesmen over 3 months, stores it in a 2D array,  
// calculates total sales for each salesman, and displays the results using nested loops.
package Array2D;
import java.util.*;
/**
 *
 * @author Samim
 */
public class Salesman 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int  ar[][]=new int[2][3];
        int  sales[][]=new int[2][1];
        int sum=0;
        
        for(int i=0;i<2;i++)
        {
            System.out.println("Enter Sales Of Salesman "+(i+1));
            for(int j=0;j<3;j++)
            {
                ar[i][j]=sc.nextInt();
                sum=sum+ar[i][j];
            }
            for(int k=0;k<1;k++)
            {
                sales[i][k]=sum;
            }
            sum=0;
        }
        for(int i=0;i<2;i++)
        {
            System.out.println(" Total Sales Of Salesman "+(i+1));
            for(int j=0;j<1;j++)
            {
                System.out.println(sales[i][j]);
            }
        }
    }
}
