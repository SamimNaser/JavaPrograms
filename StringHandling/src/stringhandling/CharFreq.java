// Program: Character Frequency Counter in a String  
// Topic: String Handling  
// Description: Reads a sentence from user input and calculates the frequency of each character, ignoring spaces.  
// Displays each unique character along with its occurrence count. Demonstrates string traversal, character comparison,  
// and use of substring manipulation to remove counted characters dynamically.
package stringhandling;
import java.util.*;
/**
 *
 * @author Samim
 */
public class CharFreq{

    void  Frequency(String s){
        int counter;
        
        System.out.println("Frequency :");
        
        for(int i=0;i<s.length();i++){
            counter=1;
            
            for(int j=i+1;j<s.length();j++){
                
                if(s.charAt(i)==s.charAt(j)){
                    counter++;
                    
                    s=s.substring(0,j)+s.substring(j+1,s.length());
                    
//                    System.out.println("j Output :"+j);
                    j=j-1;
                    
//                    System.out.println(s);
//                    System.out.println("j Output :"+j);
                }
            }
            if(s.charAt(i)!=' '){
                System.out.println(s.charAt(i)+" : "+counter);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s;
        System.out.println("Enter The Sentence :");
        s=sc.nextLine();
        CharFreq obj=new CharFreq();
        obj.Frequency(s);
        
    }
    
}
