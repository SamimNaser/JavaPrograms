// Program: Compute GCD Using Iteration and Recursion  
// Topic: Recursion and Mathematical Algorithms  
// Description: Reads two integers from user input and computes their Greatest Common Divisor (GCD) in two ways —  
// using an iterative method `GCD()` and a recursive method `gcd()`. Demonstrates the Euclidean algorithm in both forms  
// to highlight differences between iterative and recursive approaches for solving the same problem. 
package recursion;
import java.util.*;
/**
 *
 * @author Samim
 */
public class GCD 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n1,n2;
        System.out.println("Enter First Number :");
        n1=sc.nextInt();
        n2=sc.nextInt();
        
        System.out.println(gcd(n1,n2));
        
        System.out.println("Arithematic Logic :"+GCD(n1,n2));
    }
    public static  int GCD(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public static long gcd(int a,int b)
    {
        if(b==0)
        {
            return a;
        }
        return gcd(b,a%b);
    }
}
