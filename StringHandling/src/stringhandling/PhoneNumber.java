// Program: Format and Display a Phone Number  
// Topic: String Handling and Substring Operations  
// Description: Reads a phone number as a string, extracts the area code and local number using substring methods,  
// and displays it in a formatted style. If the area code is "091", it prints a specific message; otherwise,  
// it displays the number with the area code enclosed in parentheses.
package stringhandling;
import java.util.*;
/**
 *
 * @author Samim
 */              
public class PhoneNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        String n;
        String code;
        String nsub1;
        String nsub2;
        System.out.println("Enter Phone Number :");
        System.out.println("Enter The Phone Number :");
        n=sc.next();
        
        code=n.substring(0,3);
        nsub1=n.substring(3,8);
        nsub2=n.substring(8,13);
        if(code.equals("091")){
            System.out.println("The Area Code is :"+code);
            System.out.println("The Phone Number Entered is :");
            System.out.println(nsub1+"-"+nsub2);
            System.out.println(nsub1+"---"+nsub2);
        }
        else{
            System.out.println("("+code+")"+nsub1+"-"+nsub2);
        }
    }
}
