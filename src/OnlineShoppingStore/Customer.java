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
public class Customer {
    public static void main(String[] args){
        OnlineShoppingStore onlineStore = new OnlineShoppingStore();
        onlineStore.showItem();       
        
      /*  
        // Scanner scan <<3
      System.out.println("What amount of" + "Calculator");
       // Scanner scan <<1
        System.out.println("Do you want to continue shopping (y/n)"); 
        if ("Y"){
        
        }else {
              onlineStore.checkout();
        }
        
        */
       //checkout
        onlineStore.checkOut();
    }
}
