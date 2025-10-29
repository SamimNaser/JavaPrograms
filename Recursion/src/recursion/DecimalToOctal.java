// Program: Convert Decimal Number to Octal Using Recursion  
// Topic: Recursion and Number System Conversion  
// Description: Reads a decimal number from user input and recursively converts it to its octal equivalent.  
// The method `decToOct()` repeatedly divides the number by 
package recursion;
import java.util.*;
/**
 *
 * @author Samim
 */
public class DecimalToOctal 
{
    static int tmp=1;
    static int oct=0;
    public static int decToOct(int num) {
      if (num != 0) {
        oct = oct + (num % 8) * tmp;
        tmp = tmp * 10;
        decToOct(num / 8);  
      }
      return oct;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Decimal Number");
        int num=sc.nextInt();
        System.out.println("In Octal :");
        System.out.println(decToOct(num));
    }
}
