// Program: Generate Short Form of a Name  
// Topic: String Handling  
// Description: Reads a full name from user input and converts it into its short form by taking the initials of all words  
// except the last one and appending the full last name. Demonstrates use of string manipulation, character indexing,  
// and case conversion methods.
package stringhandling;
import java.util.*;
/**
 *
 * @author Samim
 */
public class ShortForm{
    
    static String Transform(String s){
        s=" "+s;
        s=s.toUpperCase();
        String w="";
        char l=s.charAt(s.lastIndexOf(' ')+1);
        
        
        for(int i=0;i<s.lastIndexOf(' ');i++){
            if(s.charAt(i)==' '){
                w+=s.charAt(i+1)+".";
            }
        }
        w+=l;
        return w;
    }
    public static void main(String[]args){
        
        Scanner sc=new Scanner(System.in);
        String s;
        System.out.println("Enter The Strng :");
        s=sc.nextLine();
        
        String r=Transform(s);
        System.out.println("Short Form :"+r);
    }
}
