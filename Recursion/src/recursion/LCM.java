// Program: Find the Least Common Multiple (LCM) Using Recursion  
// Topic: Recursion and Mathematical Computation  
// Description: Reads two integers from user input and calculates their Least Common Multiple (LCM) using recursion.  
// The recursive method increments a candidate number until it becomes divisible by both inputs, demonstrating  
// iterative recursion and use of mathematical conditions.
package recursion;
import java.util.*;
/**
 *
 * @author Samim
 */ 
public class LCM {
    int LCM(int a,int b,int max){
        
        if(max%a==0 && max%b==0){
            return max;
        }
        return LCM(a,b,max+1);
    }
    
    int getLCM(int a,int b){
        int max=Math.max(a, b);
        return LCM(a,b,max);
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b;
        
        System.out.println("Enter The Numbers :");
        a=sc.nextInt();
        b=sc.nextInt();
        
        LCM obj=new LCM();
        int lcmp=obj.getLCM(a, b);
        
        System.out.println(lcmp);
    }
}
