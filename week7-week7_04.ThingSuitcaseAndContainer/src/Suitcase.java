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

public class Suitcase {
    
    private int weightLimit;
    private ArrayList<Thing> things = new ArrayList<Thing>();
    private int counter;
    
    public Suitcase(int weightLimit) {
        this.weightLimit = weightLimit;
        this.counter = 0;
    }
    
    public void addThing(Thing thing) {
        if (thing.getWeight() + counter <= weightLimit) {
            things.add(thing);
            counter += thing.getWeight();   
        }
    }
    
    public String toString() {
        int weightHolder = 0;
        String stringy = "";
        for (Thing thingies : things) {
            weightHolder += thingies.getWeight();
            //stringy += thingies;
        }
        //return stringy;
        if (things.size() == 0) {
            stringy = "empty (" + weightHolder + " kg)"; 
        } else if (things.size() == 1) {
            stringy = things.size() + " thing (" + weightHolder + " kg)";
        } else {
            stringy = things.size() + " things (" + weightHolder + " kg)";
        }
        return stringy;
    }
    
    public void printThings() {
        for (Thing thingies : things) {
            System.out.println(thingies);
        }
    }
    
    public int totalWeight() {
        return counter;
    }
    
    public Thing heaviestThing() {
        Thing heaviest = new Thing("",0);
        if (!things.isEmpty()) {
            heaviest = things.get(0);
            for (Thing thingies: things) {
                if (thingies.getWeight()>= heaviest.getWeight()) {
                    heaviest = thingies;
                }
            } 
        } else {
            heaviest = null;
        }
        return heaviest;
    }
    
}
