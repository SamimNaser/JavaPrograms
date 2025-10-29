// Program: Duck Behavior Using Multiple Interfaces  
// Topic: Interfaces and Inheritance in Java  
// Description: Demonstrates multiple inheritance through interfaces.  
// Defines `Flyable` and `Swimmable` interfaces, both implemented by the `Main` class to represent a duck’s abilities.  
// The `Duck` class contains the `main()` method to create an object and invoke both `fly()` and `swim()` methods.
package inheritence;
/**
 *
 * @author Samim
 */
interface Flyable{
    void fly();
}
interface Swimmable{           
    void swim();
}
class Main implements Flyable,Swimmable{
    @Override
    public void fly(){
        System.out.println("Duck Is Flying");
    }
    
    @Override
    public void swim(){   
        System.out.println("Duck Is Swimming");
    }
}
public class Duck{
    public static void main(String args[]){
        Main obj=new Main();
        obj.fly();
        obj.swim();
    }
}
