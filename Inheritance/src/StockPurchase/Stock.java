/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StockPurchase;

/**
 *
 * @author Samim
 */
public class Stock {
    String item;
    double qty,rate,amt;
    Stock(String s,double q,double r){
        item=s;
        qty=q;
        rate=r;
        amt=qty*rate;
    }
    
    void display(){
        System.out.println("Initial Stock details :");
        System.out.println("Stock Quantity :"+qty);
        System.out.println("Rate :"+rate);
        System.out.println("Stock Value :"+amt);
    }
}
