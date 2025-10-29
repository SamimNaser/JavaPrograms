/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WorkerWages;

/**
 *
 * @author Samim
 */
public class Worker {
    String Name;
    double Basic;
    Worker(double b,String n){
        Name=n;
        Basic=b;
    }
    void display(){
        System.out.println("Worker Name :"+Name);
        System.out.println("Basic Pay :"+Basic);
    }
}
