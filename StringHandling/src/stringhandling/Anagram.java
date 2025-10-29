// Program: Check if a Sentence is an Anagram and Find Longest & Shortest Words  
// Topic: String Handling  
// Description: Accepts a sentence as input, identifies the longest and shortest words,  
// and checks if the sentence contains all letters of the English alphabet (an anagram/pangram check).  
// Demonstrates string traversal, character comparison, and use of HashSet for unique character validation.
package stringhandling;
import java.util.*;
/**
 *
 * @author Samim
 */
public class Anagram {
    String l="";
    String StringStructure(String s){
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)!=' '){
                    if(s.charAt(i)==s.charAt(j)){
                        s=s.substring(0,j)+s.substring(j+1);
                    }
                }
            }
        }
        return s;
    }
    boolean isAnagram(String s){
        int counter=0;
        for(char i='a';i<='z';i++){
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)!=' '){
                    if(s.charAt(j)==i){
                        //System.out.println(s.charAt(j)+" : "+(i));
                        counter++;
                    }
                }
            }
        }
        return counter==26;
    }
    void longest(String s){
        String w="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                w+=s.charAt(i);
            }
            else{
                if(l.length()<w.length()){
                    l=w;
                }
                w="";
            }
        }
        System.out.println("Longest Word :"+l);
    }
    void shortest(String s){
        String sh=l;
        String w="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                w+=s.charAt(i);
            }
            else{
                if(sh.length()>w.length()){
                    sh=w;
                }
                w="";
            }
        }
        System.out.println("Shortest WOrd :"+sh);
    }
    boolean anagramTest(String s){
       
            Set<Character> t=new HashSet();
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)!=' ')
                t.add(s.charAt(i));
            }
            return t.size()==26;
            
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s,stest;
        System.out.println("Enter The Sentence :");
        s=sc.nextLine();
        
        Anagram obj=new Anagram();   
        obj.longest(s);
        obj.shortest(s);
        stest=obj.StringStructure(s);
        if(obj.isAnagram(stest)==true){
            System.out.println("Sentence is anagram !");
        }
        else{
            System.out.println("Sentence is not anagram !");
        }
        if(obj.anagramTest(s)==true){
            System.out.println("Sentence is anagram !");
        }
        else{
            System.out.println("Sentence is not anagram !");
        }
    }
}
