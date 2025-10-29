// Program: Handle Array Input with Exception Handling
// Topic: Arrays and Exception Handling
// Description: Takes an array of student marks as input and demonstrates use of try-catch-finally blocks. 
// Catches ArrayIndexOutOfBoundsException, InputMismatchException, and generic Exception to show different error cases.
package Array;
import java.util.*;
/**
 *
 * @author Samim
 */
public class Array 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter N :");
        n=sc.nextInt();
        int ar[]=new int[n];
        try{
        for(int i=0;i<=n;i++)
        {
            System.out.println("Enter Marks of student "+(i+1)+":");
            ar[i]=sc.nextInt();
        }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Out Of Bound");
            for(int i=0;i<n;i++)
            {
                System.out.println("Marks["+(i)+"]="+ar[i]);
            }
        }
        catch(InputMismatchException e)
        {
            System.out.println("Number Format Exception");
        }
        catch(Exception e)
        {
            System.out.println("Parent Exception");
            for(int i=0;i<n;i++)
            {
                System.out.println("Marks["+(i)+"]="+ar[i]);
            }
        }
        finally
        {
            System.out.println("Finally");
        }
    }
}
