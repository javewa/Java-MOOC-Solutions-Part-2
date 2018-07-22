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

public class Container {
    
    private int weightLimit;
    private ArrayList<Suitcase> suitcases = new ArrayList<Suitcase>();
    private int totalWeight;
    
    public Container(int weightLimit) {
        this.weightLimit = weightLimit;
        this.totalWeight = 0;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (suitcase.totalWeight() + totalWeight <= weightLimit) {
            suitcases.add(suitcase);
            totalWeight += suitcase.totalWeight();
        }    
    }
    
    public String toString() {
        return suitcases.size() + " suitcases (" + totalWeight + " kg)";
    }
    
    public void printThings() {
        String thisString = "";
        for (Suitcase suitcasies : suitcases) {
            suitcasies.printThings();
        }
        //return thisString;
    }
    
}
