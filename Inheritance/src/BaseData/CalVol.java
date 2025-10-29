/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseData;
import java.util.*;
/**
 *
 * @author Samim
 */
public class CalVol extends Base implements Data{
    double ht;
    CalVol(double h,double r){
        super(r);
        ht=h;
    }
    @Override
    public double volume(){
        double vol=pi*ht*rad;
        
        return vol;
    }
    @Override
    void show(){
        super.show();
        System.out.println("Height :"+ht);
        System.out.println("Volume :"+volume());
    }
    public static void main(String[] args){
        CalVol obj=new CalVol(12,5);
        obj.volume();
        obj.show();
    }
}
