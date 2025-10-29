// Program: Check if a String is a Palindrome Using Recursion  
// Topic: Recursion and String Handling  
// Description: Reads a string from user input and recursively reverses it using the method `PalinCheck()`.  
// After reversing, the program compares the reversed string with the original to check if it is a palindrome.  
// Demonstrates recursive string traversal, base condition handling, and use of static variables for accumulation.  
package recursion;
import java.util.*;
/**
 *
 * @author Samim
 */
public class Palindrome {
    static String s;
    static String rev="";
    void PalinCheck(int i){
        if(i<0){
        }
        else{
        rev=rev+s.charAt(i);
        PalinCheck(i-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Palindrome obj=new Palindrome();
        System.out.println("Enter S :");
        s=sc.next();
        obj.PalinCheck(s.length()-1);
        System.out.println(rev);
        if(rev.equals(s)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
