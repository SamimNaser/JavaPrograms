// Program: Calculate Areas of Geometric Shapes Using Inheritance  
// Topic: Inheritance and Polymorphism  
// Description: Demonstrates hierarchical inheritance where the base class `Dimension` defines common attributes  
// and methods for shapes. The derived classes `Square`, `Rectangle`, and `Triangle` extend it and override  
// `CalcArea()` to compute respective areas. The `GeoShapes` class creates objects of each shape and displays their details.
package inheritence;
import java.util.*;
/**
 *    
 * @author Samim
 */
public class Dimension {
    int nos;
    double sides[];
    double area;
    void CalcArea(){area =0;}

    public Dimension(int num) {
        nos=num;
        sides=new double[num];
    }
    void readsides(){ 
        Scanner sc=new Scanner(System.in);
        
        for(int i=0;i<nos;i++){
            System.out.println("Enter Side :"+(i+1)+" : ");
            sides[i]=sc.nextDouble();
        }
    
    }
}
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
}
class Rectangle extends Dimension
{
    Rectangle() {
            super(2);
            System.out.println("-----Rectangle-----");
            readsides();
    }
    
    @Override
    void CalcArea(){
        area=sides[0]*sides[1];
    }
    
    void Display(){
        System.out.println("Rectangle Statistics :");
        System.out.println("Length :"+sides[0]);
        System.out.println("Breadth :"+sides[1]);
        CalcArea();
        System.out.println("Area :"+area);
    }
}
class Triangle extends Dimension
{
    Triangle() {
        super(3);
        System.out.println("-----Triangle-----");
        readsides();
    }
    
    @Override
    void CalcArea(){
        double s=(sides[0]+sides[1]+sides[2])/2;
        area=Math.sqrt(s*(s-sides[0])*(s-sides[1])*(s-sides[2]));
    }
    
    void Display(){
        System.out.println("Triangle Statistics :");
        System.out.println("Side 1 :"+sides[0]);
        System.out.println("Side 2 :"+sides[1]);
        System.out.println("Side 3 :"+sides[2]);
        CalcArea();
        System.out.println("Area :"+area);
    }
}
class GeoShapes {
    public static void main(String[] args){
        Square sqr=new Square();
        Rectangle rect=new Rectangle();
        Triangle trg=new Triangle();
        
        sqr.Display();
        rect.Display();
        trg.Display();
    }
}
