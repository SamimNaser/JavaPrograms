// Program: Calculate Total and Average Sales with Exception Handling  
// Topic: Arrays and Exception Handling  
// Description: Reads daily sales amounts into an array, calculates total and average sales,  
// and demonstrates the use of try-catch-finally blocks to handle runtime errors like array index issues or invalid input.
package Array;
import java.util.*;
/**
 *
 * @author Samim
 */
public class Array2 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        final int n=5;
        float sales[]=new float[n];
        float avg,total=0;
        try{
            for(int i=0;i<=n;i++)
            {
                System.out.println("Enter Sales made on day "+(i+1)+":");
                sales[i]=sc.nextInt();
                sales[i]=sc.nextInt(); 
                total=total+sales[i];
            }
        }
        catch (Exception e){
        
            avg=total/n;
            System.out.println("Total Sales :"+total);
            System.out.println("Average sales :"+avg);
        }
        finally
        {
            System.out.println("finally");
        }
    }
}
