// Program: Vertical Display of Team Names  
// Topic: String Handling and Arrays  
// Description: Reads multiple team names and prints them vertically character by character,  
// aligning columns based on the longest word length. Demonstrates use of nested loops,  
// string length comparison, and formatted output for text alignment.
package stringhandling;
import java.util.*;
/**
 *
 * @author Samim
 */
public class Event {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int maxlength=0;
        int n;  
        System.out.println("Enter The Number Of Teams (1<N<10) :");
        n=sc.nextInt();
        String ar[]=new String [n]; 
        
        
        if(n>1 && n<9){
            System.out.println("Enter The Teams :");
            for(int i=0;i<n;i++){
            ar[i]=sc.next();
            }
        }
        else{
            System.out.println("Input Not in Range :");
            System.exit(0);
        }
        
        for(String teams:ar){
            if(teams.length()>maxlength){
                maxlength=teams.length();
            } 
        }
             
        for(int i=0;i<maxlength;i++){
            for(int j=0;j<ar.length;j++){
                if(i<ar[j].length()){
                    System.out.print(ar[j].charAt(i));
                }
                else
                {
                    System.out.print(" ");
                }
                if(j<ar.length-1){
                    System.out.print("        ");
                }
            }
            System.out.println();
        }
    }
}

