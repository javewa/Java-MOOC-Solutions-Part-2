/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nacht
 */
import java.util.ArrayList;

public class Box implements Comparable{
    
    private double maxCapacity;
    private ArrayList<Comparable> things = new ArrayList<Comparable>();
    private double currentWeight;
    
    public Box(double maxCapacity) {
        this.maxCapacity = maxCapacity;
    }
    
    public void add(Comparable thing) {
        if (thing.weight() + weight() <= maxCapacity) {
            things.add(thing);
        }
    }
    
    public String toString() {
        return "Box: " + things.size() + " things, total weight " + weight() + " kg";
    }
    
    public double weight() {
        currentWeight = 0;
        for (Comparable thing : things) {
            currentWeight += thing.weight();
        }
        return currentWeight;
    }
    
}
