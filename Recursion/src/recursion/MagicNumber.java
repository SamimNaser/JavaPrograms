// Program: Check if a Number is a Magic Number Using Recursion  
// Topic: Recursion and Number Properties  
// Description: A magic number is one whose repeated sum of digits eventually becomes 1.  
// This program reads an integer from user input and uses recursion to repeatedly sum its digits  
// until a single-digit number is obtained, checking if it equals 1 to determine if it is a magic number.  
package recursion;
import java.util.*;
/**
 *
 * @author Samim
 */
class MagicNumber{
    int sum=0;
    boolean isMagic(int n){
        int sum=0;
        if(n<10){
            return n==1;
        }
        while(n>0){
            int d=n%10;
            sum+=d;
            n=n/10;
        }
        return isMagic(sum);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter The NUmber ");
        num=sc.nextInt();
        MagicNumber obj=new MagicNumber();
        if(obj.isMagic(num)){
            System.out.println("Magic Number");
        }
        else{
            System.out.println("Not A MAgic Number");
        }
    }
}
