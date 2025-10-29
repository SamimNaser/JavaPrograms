// Program: Calculate Area of a Square Using Inheritance  
// Topic: Inheritance and Method Overriding  
// Description: Demonstrates inheritance where the `Square` class extends the base class `Dimension`.  
// The base class provides side input functionality, while the derived class overrides `CalcArea()`  
// to compute the square’s area and display its properties using the `Display()` method.
package inheritence;
/**
 *
 * @author Samim    
 */
class Square extends Dimension{
    Square() {
        super(1);
        System.out.println("-----Square-----");
        readsides();
    }
    
    @Override
    void CalcArea(){
        area=sides[0]*sides[0];
    }
    
    void Display(){
        System.out.println("Square Statistics :");
        System.out.println("Side :"+sides[0]);
        CalcArea();
        System.out.println("Area :"+area);
    }
    public static void main(String[] args){
        Square sqr=new Square();
        
        sqr.Display();
    }
}