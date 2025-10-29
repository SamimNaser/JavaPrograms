// Program: Basic Example of Inheritance  
// Topic: Inheritance in Java  
// Description: Demonstrates simple single inheritance where the `Child` class inherits a variable and method  
// from the `Parent` class. The parent class accepts a principal amount as input, and the child class displays it,  
// showing how derived classes can access base class members.
package inheritence;
import java.util.*;
/**
 *
 * @author  Samim
 */
class Parent
{
    int p;
    void input()
    {
        Scanner sc=new Scanner(System.in) ;
        System.out.println("Enter Any Principal Amount :");
        p=sc.nextInt();
    }
}
class Child extends Parent
{
    void display()
    {
        System.out.println("Entered Principal :"+p);
    }
}
class InheritenceBasic 
{
    public static void main(String args[])
    {
        Child a =new Child ();
        a.input();
        a.display();  
    }
}
