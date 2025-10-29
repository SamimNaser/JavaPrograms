/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StockPurchase;

/**
 *
 * @author Samim
 */
public class Purchase extends Stock{
    double pqty,prate;
    public Purchase(int pq,int pr,String s,double qt,double rt ) {
        super(s,qt,rt);
        pqty=pq;
        prate=pr;
    }
    void update(){
        qty=qty+pqty;
        if(prate!=rate){
            rate=prate;
        }
        
        amt=qty*rate;
    }
    @Override
    void display(){
        super.display();
        System.out.println();
        update();
        super.display();
    }
    
    public static void main(String args[]){
        Purchase obj=new Purchase(500,3,"Pen",1000,2.5);
        obj.display();
    }
    
}
