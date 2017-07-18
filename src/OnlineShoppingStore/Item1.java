/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineShoppingStore;

/**
 *
 * @author ARIT
 */
public class Item1 {
    private int id;
    private String listItem;
    private double price;
    private int qty;
    
    public Item1(int id,double price,String listItem){
    
        this.id = id ;
        this.price = price;        
        this.listItem = listItem;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }
    
    public String getlistItem() {
       return listItem;
    }
    
    public int getQty(){
        return qty;
    }
    public void setQty(int qty){
        this.qty = qty;
    }   
    
}
