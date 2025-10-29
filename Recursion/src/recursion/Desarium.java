// Program: Check if a Number is a Desarium Number Using Recursion  
// Topic: Recursion and Number Properties  
// Description: A Desarium number is one in which the sum of its digits powered with their respective positions equals the number itself.  
// This program calculates the number of digits, then recursively computes the sum of digits raised to their positions using `sumofdigits()`.  
// Demonstrates recursion, mathematical computation, and object-oriented encapsulation in Java.
package recursion;
import java.util.*;
/**
 *
 * @author Samim
 */
public class Desarium 
{
    int num;

    int size;
    Desarium(int nn)
    {
        num=nn;
        size=0;
    }
    void digits()
    {
        for(int i=num;i!=0;i/=10)
        {
            size++;
        }
    }
    int sumofdigits(int nn1,int p)
    {
        int d;
        if(nn1==0)
        {
            return 0;
        }
        else
            d = nn1%10;
        return (int)Math.pow(d,p)+sumofdigits(nn1/10,--p);
    }
    
    void Check()
    {
        int sum=0;
        sum=sum+sumofdigits(num,size);
        if(sum==num)
        {
            System.out.println("Desarium Number");
        }
        else
        {
            System.out.println("Not Desarium Number");
            
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter The Number :");
        n=sc.nextInt();
        Desarium obj=new Desarium(n);
        obj.digits();
        obj.Check();
    }
}
