// Program: Employee Details Using Inheritance  
// Topic: Inheritance and Method Overriding  
// Description: Demonstrates inheritance where the subclass `Details` extends the base class `Employee`.  
// The subclass overrides the `getLastName()` method to add additional input fields like employee post and ID.  
// The program collects employee information and displays all details using inherited and overridden methods.
package inheritence;
import java.util.*;
/**
 *
 * @author Samim
 */
class Employee{
    
    Scanner sc=new Scanner(System.in);
    
    String getFirstName(){
        System.out.println("Enter First Name :");
        String FirstName=sc.next();
        return FirstName;
    }
    
    String getLastName(){
        System.out.println("Enter Last Name :");
        String LastName=sc.next();
        return LastName;
    }
}

class Details extends Employee{
    String setLastName;
    String setFirstName = super.getFirstName();
    String p;
    int id;
    
    @Override
        String getLastName(){
            setLastName=super.getLastName();
            System.out.println("Enter Post :");
            p=sc.next();
            return "";
    }
    
    void employeeID(){
        System.out.println("Enter Employee ID :");
        id=sc.nextInt();
    }
    
    void Display(){
        System.out.println("Employee Details :");
        System.out.println("Employee ID :"+id);
        System.out.println("First Name :"+setFirstName);
        System.out.println("Last Name :"+setLastName);
        System.out.println("Post :"+p);
    }
}
public class Person {
    public static void main(String[] args){
        Details obj=new Details();
        obj.getLastName();
        obj.employeeID();
        obj.Display();
    }
}
