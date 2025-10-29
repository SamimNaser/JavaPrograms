/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shape;
/**
 *
 * @author Samim
 */
public class Circle {
    double radius;
    Circle(){
        radius=0.0;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double value){
        if(radius<0){
            radius=0.0;
        }
        else{
            radius=value;
        }
    }
    public double CalcDiameter(){
        return radius*2;
    }
    public double CalcCircumferance(){
        return CalcDiameter()*Math.PI;
    }
    public double CalcArea(){
        return Math.pow(radius,2)*Math.PI;
    }
}