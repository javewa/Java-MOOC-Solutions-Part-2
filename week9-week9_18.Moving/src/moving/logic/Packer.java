/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.logic;

/**
 *
 * @author nacht
 */
import java.util.List;
import moving.domain.Box;
import moving.domain.Thing;
import java.util.ArrayList;

public class Packer {
    
    private int boxesVolume;
    private List<Box> boxes;
    
    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
        this.boxes = new ArrayList<Box>();
    }
    
    public List<Box> packThings(List<Thing> things) {
        Box myBox = new Box(boxesVolume);
        for (Thing thing : things) {   
            if (myBox.getVolume() + thing.getVolume() <= boxesVolume) {
                myBox.addThing(thing);
            } else {
                myBox = new Box(boxesVolume);
                myBox.addThing(thing);
            }
            if (!boxes.contains(myBox)) {
                boxes.add(myBox);
            }
        }
        return boxes;
    }
    
}
