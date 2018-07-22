/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

/**
 *
 * @author nacht
 */
import java.util.List;
import java.util.ArrayList;

public class Box implements Thing{
    
    private int maxCapacity;
    private List<Thing> things;
    
    public Box(int maximumCapacity) {
        this.maxCapacity = maximumCapacity;
        this.things = new ArrayList<Thing>();
    }
    
    public boolean addThing(Thing thing) {
        boolean b = false;
        if (thing.getVolume() + getVolume() <= maxCapacity) {
            things.add(thing);
            b = true;
        }
        return b;        
    }
    
    public List<Thing> getThings() {
        return things;
    }
    
    @Override
    public int getVolume() {
        int c = 0;
        for (Thing thing : things) {
            c += thing.getVolume();
        }
        return c;
    }
    
}
