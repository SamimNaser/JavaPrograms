/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shape;
/**
 *
 * @author Samim
 */
public class Cyclinder extends Circle {
    double height;
    Cyclinder(){
        height=0.0;
    }
    public double getHeight(){
        return height;
    }
    public void setHieght(double value){
        if(height<0){
            height=0.0;
        }
        else{
            height=value;
        }
    }
    public double CalcLateralArea(){
        return 2*radius*height*Math.PI;
    }
    public double CalcTotalArea(){
        return 2*radius*(height+radius)*Math.PI;
    }
    public double CalcVolume(){
        return Math.pow(radius,2)*height*Math.PI;
    }
    
}
    
