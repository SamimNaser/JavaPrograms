// Program: Convert Decimal Number to Binary Using Recursion  
// Topic: Recursion and Number Conversion  
// Description: Reads a decimal number from user input and recursively converts it into its binary representation.  
// The helper method `DectoBinHelp()` divides the number by 2 at each step and appends remainders recursively.  
// Demonstrates recursive function calls, base conditions, and string concatenation for binary conversion.
package recursion;
import java.util.*;
/**
 *
 * @author Samim
 */
public class DecimalToBinary 
{
    private static String DectoBin(int decimalNumber) {
        if (decimalNumber == 0) {
            return "0";
        } else {
            return DectoBinHelp(decimalNumber);
        }
    }

    private static String DectoBinHelp(int decimalNumber) {
        if (decimalNumber == 0) {
            return "";
        } else {
            int remainder = decimalNumber % 2;
            return DectoBinHelp(decimalNumber / 2) + remainder;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter Num :");
        num=sc.nextInt();
        System.out.println(DectoBin(num));
    }
}
