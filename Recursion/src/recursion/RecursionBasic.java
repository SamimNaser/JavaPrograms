// Program: Sum of Natural Numbers Using Recursion  
// Topic: Recursion and Mathematical Computation  
// Description: Calculates the sum of the first ‘n’ natural numbers using a recursive method `sum()`.  
// Demonstrates base and recursive conditions where `sum(k)` returns `k + sum(k-1)` until `k` becomes 0.  
// The program prints the total sum for a given input value.  
package recursion;

/**
 *
 * @author Samim
 */
public class RecursionBasic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int result=sum(40);
        System.out.println(result);
    }
    public static int sum(int k)
    {
        if(k>0)
        {
            return k+sum(k-1);
        }
        else
        {
            return 0;
        }
    }
    
}
