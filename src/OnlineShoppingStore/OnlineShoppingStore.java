/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineShoppingStore;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ARIT
 */
public class OnlineShoppingStore {

    private ArrayList<Item> items; //เรียกใช้ข้อมูลจาก Item -> is,price
    private ArrayList<Item> buyItems;

    // set constructor
    public OnlineShoppingStore() {
        items = new ArrayList();
        buyItems = new ArrayList();
        /*
        Item item1 = new ClockItem(1,12);
        Item item2 = new ChairItem(2,10);
        Item item3 = new CalculatorItem(3,50);
        this.items.add(item1);
        this.items.add(item2);
        this.items.add(item3);
         */
        this.items.add(new ClockItem(1, 12));
        this.items.add(new ChairItem(2, 10));
        this.items.add(new CalculatorItem(3, 50));
    }

   
    
    //show item
    public void showItem() {
        String input;
        do {
            System.out.println("What would you like to buy?");
            for (Item item : items) {
                System.out.println(item.getId() + ":" + item.getlistItem() + " (" + item.getPrice() + ")");
            }

            Scanner sc = new Scanner(System.in);
            input = sc.nextLine();

            for (Item item : items) {
                if (Integer.valueOf(input) == item.getId()) {  //รับค่าจาก input 
                    System.out.println("What amount of item " + item.getlistItem() + "?");
                    // เก็บเข้าตะกร้า
                    buyItems.add(item);
                    input = sc.nextLine();
                    item.setQty(Integer.valueOf(input));
                    break;
                }
            }

            //จะซื้อต่อ?
            System.out.println("Do you want to continue shopping (Y/N)?");
            input = sc.nextLine();
        } while (input.equalsIgnoreCase("Y"));

        int totalQty = 0;
        for (Item item : buyItems) {
            totalQty = totalQty + item.getQty();
            // System.out.println("Thanks you for shopping, you have "+item.getlistItem()+" = "+ totalQty +" item in shopping cart, please checkout");
        }
        System.out.println("Thanks you for shopping, you have " + totalQty + " item in shopping cart, please checkout");

        /*
        //print total
        double total = 0;
        double amount = 0;
        for (Item item : buyItems) {
            amount = item.getPrice() * item.getQty();
            total = total + (item.getPrice() * item.getQty());
            System.out.println(item.getlistItem() + " = " + Integer.valueOf((int) amount));
        }
        //System.out.println("Total price " + Integer.valueOf((int) total) + " bath");
        System.out.println("Total price " + total + " bath");
        System.out.println("Thank You.");
        */
    }
    
    public void checkOut() {
        double total = 0;
        double amount = 0;
        for (Item item : buyItems) {
            amount = item.getPrice() * item.getQty();
            total = total + (item.getPrice() * item.getQty());
            System.out.println(item.getlistItem() + " = " + Integer.valueOf((int) amount));
        }
        //System.out.println("Total price " + Integer.valueOf((int) total) + " bath");
        System.out.println("Total price " + total + " bath");
        System.out.println("Thank You.");
    }
       
}
