// Program: Demonstration of Java Stack Class  
// Topic: Stack Data Structure (java.util.Stack)  
// Description: Shows basic operations on a stack using Java’s built-in `Stack` class.  
// Pushes and pops string elements ("Dog", "Horse", "Cat") to demonstrate LIFO behavior.  
// Prints the stack before and after a pop operation to show how elements are added and removed.  
package stack;
import java.util.Stack;
/**
 *
 * @author Samim
 */
public class StackBasic 
{
    public static void main(String args[])
    {
        
        Stack<String> animals=new Stack<>();
        
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");
        System.out.println("Stack :"+animals);
        
        animals.pop();
        System.out.println("Stack After Pop :"+animals);
    }
}
