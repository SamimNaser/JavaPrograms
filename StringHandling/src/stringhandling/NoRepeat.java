// Program: Check for Repeated Characters in a Word  
// Topic: String Handling  
// Description: Accepts a word as input and checks whether it contains any repeated characters.  
// Uses nested loops to compare each character with the rest and prints whether the word has duplicates or not.  
// Demonstrates string traversal, character comparison, and use of methods for modular logic.
package stringhandling;
import java.util.*;
/**
 *
 * @author Samim
 */
public class NoRepeat{
    
    String word;
    int len;
    
    NoRepeat(String wrd){
        word=wrd;
        len=word.length(); 
    }
    boolean Check(){
        int count=0;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if(word.charAt(i)==word.charAt(j)){
                    count++;
                }
            }
        }
        return count==0;
    }
    void Print(){
        if(Check()==true){
            System.out.println(word+" has no repeated characters !");
        }
        else{
            System.out.println(word+" has repeated characters !");
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        
        String s;
        System.out.println("Enter Word :");
        s=sc.next();
        
        NoRepeat obj=new NoRepeat(s);
        obj.Print();
    }
}
