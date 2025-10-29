// Program: Calculate Factorial of a Number Using Recursion  
// Topic: Recursion and Mathematical Computation  
// Description: Reads an integer from user input and calculates its factorial using a recursive function `fact()`.  
// Demonstrates base and recursive cases in recursion, where the factorial of a number is computed as `n * fact(n-1)`  
// until the base case (n == 0 or n == 1) is reached.
package recursion;
import java.util.*;
/**
 *
 * @author Samim
 */
public class Factorial 
{
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        else if(n==1){
            return n;
        }
        else{
            return n*fact(n-1);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter Number :");
        n=sc.nextInt();
        
        System.out.println(fact(n));
    }    
}
