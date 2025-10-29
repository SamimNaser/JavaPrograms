// Program: Compare Two Arrays for Equality  
// Topic: Arrays and Exception Handling  
// Description: Compares two integer arrays element by element to check if they are identical.  
// Uses a try-catch-finally block to handle runtime exceptions and returns true if both arrays match completely.
package Array;
/**
 *
 * @author Samim
 */
public class ArrayCompare 
{
    public boolean compare(int ar1[],int ar2[])
    {
        int n=ar1.length;
        int flag=0;
        try
        {
            for(int i=0;i<n;i++)
            {
                if(ar1[i]==ar2[i])
                {
                    flag++;
                }
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            return flag==n; 
        }
    }
    public static void main(String args[])
    {
        int ar1[]={2,3,4,5,6,7};
        int ar2[]={2,3,4,5,6,7};
        
        ArrayCompare obj=new ArrayCompare();
        boolean c=obj.compare(ar1, ar2);
        if(c==true)
        {
            System.out.println("Both Array Are Same");
        }
        else
        {
            System.out.println("Both Array Are Different");
        }
                
    } 
}
