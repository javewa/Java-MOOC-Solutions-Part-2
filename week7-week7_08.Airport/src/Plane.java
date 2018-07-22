/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nacht
 */
public class Plane {
    
    private String planeID;
    private int capacity;
    
    public Plane(String planeID, int capacity) {
        this.planeID = planeID;
        this.capacity = capacity;
    }
    
    public String returnID() {
        return planeID;
    }
    
    public String toString() {
        return planeID + " (" + capacity + " ppl)";
    }
    
}
