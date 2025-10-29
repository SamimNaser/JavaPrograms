// Program: Insertion Sort Algorithm  
// Topic: Sorting Algorithms (Arrays)  
// Description: Implements the Insertion Sort technique to arrange an array of integers in ascending order.  
// Takes user input for array elements, then iteratively inserts each element into its correct position while printing the array after each iteration.
package Sorting;
import java.util.*;
/**
 *
 * @author Samim
 */
public class InsertionSort 
{
    static int data[]=new int[5];
    static int i;
    static int loc;
    static int temp;
    static void dataPrint()
    {
        System.out.println("run()executed :i = "+i+" data =");
        for(int j=0;j<data.length;j++)
        {
            System.out.print(data[j]);
            if(j<data.length-1)
            {
                System.out.print(", ");
            }

        }
        System.out.println("""
                           """);
        System.out.println("Elements Of Array");
    }
    static void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Elements Of Array :");
        for(int i=0;i<5;i++)
        {
            data[i]=sc.nextInt();
        }
    }
    public static void main(String args[])
    {
        input();
        System.out.println("Sorting (Re)started");
        i=0;
        dataPrint();
        for(i++ ;i<data.length;i++)
        {
            temp=data[i];
            loc=i;
            for(;loc>=0;loc--)
            {
                if(loc==0||data[loc-1]<=temp)
                {
                    data[loc]=temp;
                    break;
                }
                else
                {
                    data[loc]=data[loc-1];
                }
            }
            dataPrint();
        }
        System.out.println("Sorting Completed");    
    }
}
