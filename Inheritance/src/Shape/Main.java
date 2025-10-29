/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shape;
import java.util.*;
/**
 *
 * @author Samim
 */
public class Main {
    private static Cyclinder create(){
        Scanner sc=new Scanner(System.in);
        double r,h;
        System.out.println("Enter Radius :");
        r=sc.nextDouble();
        System.out.println("Enter Height :");
        h=sc.nextDouble();
        
        Cyclinder obj=new Cyclinder();
        obj.setRadius(r);
        obj.setHieght(h);
        
        return obj;
    }
    public static void Display(Cyclinder opt){
        //Circle
        System.out.println("Radius :"+opt.getRadius());
        System.out.println("Diameter :"+opt.CalcDiameter());
        System.out.println("Circumferace :"+opt.CalcCircumferance());
        System.out.println("Circle Area :"+opt.CalcArea()); 
        
        System.out.println("");
        //Cyclinder
        System.out.println("Height :"+opt.getHeight());
        System.out.println("Lateral Area :"+opt.CalcLateralArea());
        System.out.println("Total Area :"+opt.CalcTotalArea());
        System.out.println("Voume :"+opt.CalcVolume());
    }
    public static void main(String args[]){
        
        Cyclinder tube =create();
        Display(tube);
        
    }
}
