// Program: Convert Case of Characters Using Recursion  
// Topic: Recursion and String Manipulation  
// Description: Reads a word from user input and recursively converts each character’s case —  
// uppercase to lowercase and vice versa — using a recursive function `recchange()`.  
// Demonstrates base and recursive conditions, ASCII-based case conversion, and recursive string construction.
package recursion;
import java.util.*;
/**
 *
 * @author Samim
 */
public class Change {
    String str;
    String newstr;
    int len; 
    public Change() {
        str="";
        newstr="";
        len=0;
    }
    void inputword(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Word :");
        str=sc.next();
        len=str.length();
    }
    char caseconver(char ch){
        int asc=(int)ch;
        if(asc>=65 && asc<=90){
            return (char)(ch+32);
        }
        else if(asc>=97 && asc<=122){
            return (char)(ch-32);
        }
        else return ch;
    }
    void recchange(int n){
        System.out.println(n);
        
        if(n==len){
            
            return ;
        }
        else{
            newstr=newstr+caseconver(str.charAt(n));
            recchange(n+1);
        }
    }
    void display(){
        System.out.println("String :"+str);
        System.out.println("New String :"+newstr);
    }
    public static void main(String[] args){
        Change obj=new Change();
        obj.inputword();
        obj.recchange(0);
        obj.display();
    }
}
