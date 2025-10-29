// Program: Count and Display Palindromic Words in a Sentence  
// Topic: String Handling  
// Description: Reads a sentence from user input, extracts each word, and checks whether it is a palindrome.  
// Prints all palindromic words found and displays their total count. Demonstrates string traversal,  
// reversal logic, and character comparison to identify palindrome words in a sentence.
package stringhandling;
import java.util.*;
/**
 *
 * @author Samim
 */
public class PalindromeWord 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s;
        int count=0;
        String w="";
        System.out.println("Enter The String :");
        s=sc.nextLine();
        s=s+" ";
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            {
                w+=s.charAt(i);
                //System.out.println("w :"+w);
            }
            else
            {
                String rev="";
                for(int j=w.length()-1;j>=0;j--)
                {
                    rev+=w.charAt(j);
                    //System.out.println("rev :"+rev);
                }
                if(rev.equals(w))
                {
                    count++;
                    System.out.println(w);
                }
                w="";
            }
        }
        System.out.println("Number Of Palindrome Words :"+count);
    }
}
