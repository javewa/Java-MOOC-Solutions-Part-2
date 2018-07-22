/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nacht
 */
public class Flight {
    
    private Plane plane;
    private String departureCode;
    private String destinationCode;
    
    public Flight(Plane plane, String departureCode, String destinationCode) {
        this.plane = plane;
        this.departureCode = departureCode;
        this.destinationCode = destinationCode;
    }
    
    public String toString() {
        return plane + " (" + departureCode + "-" + destinationCode + ")";
    }
    
}
