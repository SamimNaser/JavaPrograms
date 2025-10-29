// Program: Calculate Power of a Number Using Recursion  
// Topic: Recursion and Mathematical Computation  
// Description: Reads two integers ‘a’ (base) and ‘b’ (exponent) from user input and calculates a^b recursively.  
// The method `Value(a, b)` multiplies the base by the result of `Value(a, b-1)` until the exponent reaches 1.  
// Demonstrates recursive function calls, base condition checking, and mathematical recursion logic.  
package recursion;
import java.util.*;
/**
 *
 * @author Samim
 */
public class Power {
    int Value(int a,int b){
       
        if(b==1){
            return a;
        }
        else {
            return a*Value(a,b-1);
        }
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter The Value of A :");
        a=sc.nextInt();
        System.out.println("Enter The Value Of B :");
        b=sc.nextInt();
        
        Power obj=new Power();
        System.out.println(obj.Value(a, b));
        
    }
}
