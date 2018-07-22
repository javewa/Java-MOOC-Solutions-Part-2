/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nacht
 */
import java.util.List;
import java.util.ArrayList;

public class ShoppingBasket {
    
    private List<Purchase> purchases = new ArrayList<Purchase>();
    
    public ShoppingBasket() {
        
    }
    
    public void add(String product, int price) {
        Purchase newPurchase = new Purchase(product, 1, price);
        boolean isIn = false;
        for (Purchase purchase : purchases) {
            if (purchase.equals(newPurchase)) {
                purchase.increaseAmount();
                isIn = true;
            }
        }
        if (isIn == false) {
            purchases.add(newPurchase);
        }
   
    }
    
    public int price() {
        int total = 0;
        for (Purchase purchase : purchases) {
            total += purchase.price();
        }
        return total;
    }
    
    public void print() {
        for (Purchase purchase : purchases) {
            System.out.println(purchase);
        }
    }
    
    
    
}
