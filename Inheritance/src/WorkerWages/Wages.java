/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WorkerWages;
import java.util.*;
/**
 *
 * @author Samim
 */
public class Wages extends Worker{
    int hrs;
    double rate;
    double wage;
    
    Wages(String nm,double b,int h,double r){
        super(b,nm);
        hrs=h;
        rate=r;
    }
    
    double overtime(){
        double extra=hrs*rate;
        return extra;
    }
    
    @Override
    void display(){
        super.display();
        System.out.println("Hours Worker :"+hrs);
        System.out.println("Rate :"+rate);
        System.out.println("Overtime Wage :"+overtime());
        System.out.println("Total Wage :"+(overtime()+Basic));
    }
    
    public static void main(String[] args){
        Wages obj=new Wages("Sam",25000,48,200);
        obj.overtime();
        obj.display();
    }
}
