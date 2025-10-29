// Program: Generate Fibonacci Series Using Recursion  
// Topic: Recursion and Number Series  
// Description: Reads a number ‘n’ from user input and prints the first ‘n’ Fibonacci numbers using a recursive method `fib()`.  
// Demonstrates base and recursive cases to compute Fibonacci terms as `fib(n) = fib(n-1) + fib(n-2)`.  
// Highlights recursion depth, stack calls, and iterative printing of the generated sequence.
package recursion;
import java.util.*;
/**
 *
 * @author Samim
 */
public class Fibonacci 
{
    public int fib(int n)
    {
            if(n<=1)
            {
                return n;
            }
            else
            {
                return fib(n-1)+fib(n-2);   
            }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter Number Of terms :");
        n=sc.nextInt();
        Fibonacci obj=new Fibonacci();
        System.out.println("Even fibonacci Numbers :");
        for(int i=1;i<=n;i++)
        {
            System.out.println(obj.fib(i));
        }
    }
}
