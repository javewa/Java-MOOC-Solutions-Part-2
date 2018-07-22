/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

/**
 *
 * @author nacht
 */
import java.util.ArrayList;
import java.util.List;

public class MaxWeightBox extends Box{
    
    private int maxWeight;
    private List<Thing> things = new ArrayList<Thing>();
    
    
    public MaxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
    }
    
    @Override
    public void add(Thing thing) {
        int c = 0;
        for (Thing thingies : things) {
            c += thingies.getWeight();
        }
        if (thing.getWeight() +  c <= maxWeight) {
            things.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return things.contains(thing);
    }
    
    
    
    
}
