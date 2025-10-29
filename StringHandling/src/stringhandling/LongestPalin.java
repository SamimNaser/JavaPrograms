// Program: Find the Longest Palindromic Word in a Sentence  
// Topic: String Handling  
// Description: Reads a sentence from user input and identifies the longest word that is a palindrome.  
// Splits the input into words, checks each for palindrome property by reversing it, and prints the longest one found.  
// If no palindrome exists, displays an appropriate message.
package stringhandling;
import java.util.*;
/**
 *
 * @author Samim
 */
public class LongestPalin {
    
    static String PalinCheck(String s){
        s=s+" ";
        String w="";
        String longest="";
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){//finding each word
                w+=s.charAt(i);
            }
            else{
                String rev="";
                for(int j=w.length()-1;j>=0;j--){//finding reverse
                    rev+=w.charAt(j);
                }
                if(rev.equals(w)){//checking palindrome
                    if(longest.length()<rev.length()){//finding longest
                        longest=rev;
                    }
                }
                w="";
            }
        }
        if(longest.equals("")){// if no palindrome present 
            System.out.println("No Palindrome Word !"); 
            System.exit(0);
        }
        return longest;
    } 
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s;
        System.out.println("Enter The String :");
        s=sc.nextLine();
        
        PalinCheck(s);
        System.out.println("Longest Palindrome In Sentence :"+PalinCheck(s));
    }
}
