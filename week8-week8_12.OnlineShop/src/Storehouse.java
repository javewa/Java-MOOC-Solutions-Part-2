/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nacht
 */
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class Storehouse {
    
    private Map <String, Integer> productPrice = new HashMap <String, Integer>();
    private Map <String, Integer> productStock = new HashMap <String, Integer>();
    
    public void addProduct(String product, int price, int stock) {
        productPrice.put(product, price);
        productStock.put(product, stock);
    }
    
    public int price(String product) {
        int c = -99;
        if (productPrice.containsKey(product)) {
            c = productPrice.get(product);
        }
        return c;
    }
    
    public int stock(String product) {
        int c = 0;
        if (productStock.keySet().contains(product)) {
            c = productStock.get(product);
        }
        return c;
    }
    
    public boolean take(String product) {
        boolean c = false;
        if (productStock.keySet().contains(product) && productStock.get(product) > 0) {
            c = true;
            productStock.put(product, productStock.get(product) - 1);
        }
        return c;
    }
    
    public Set<String> products() {
        return productPrice.keySet();
    }  
    
}
