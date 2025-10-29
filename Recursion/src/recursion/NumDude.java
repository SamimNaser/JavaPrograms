// Program: Check if a Number is a Dudeney Number Using Recursion  
// Topic: Recursion and Number Properties  
// Description: A Dudeney number is a number that is the cube of the sum of its digits.  
// This program reads an integer from user input, recursively computes the sum of its digits,  
// and checks whether the cube of that sum equals the original number.  
// Demonstrates recursion, modular arithmetic, and mathematical condition checking.
package recursion;
import java.util.*;
/**
 *
 * @author Samim
 */
public class NumDude {
    int num;
    public NumDude() {
        num=0;
    }
    void input(){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter The Number :");
        num=sc.nextInt();
    }
    int sumOfdigits(int x){
            if(x==0){
                return 0;
            }
            int d=x%10;
            System.out.println(d);
            return d+sumOfdigits(x/10);
    }
    void isDude(){
        if(Math.pow(sumOfdigits(num),3)==num){
            System.out.println("Dudeney  Number");
        }
        else{
            System.out.println("Not Dudeney Number");
        }
    }
    public static void main(String args[]){
        NumDude obj=new NumDude();
        obj.input();
        obj.isDude();
    }
}
