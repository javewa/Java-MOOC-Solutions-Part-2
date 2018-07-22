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

public class Airport {
    
    private ArrayList<Flight> flights = new ArrayList<Flight>();
    private ArrayList<Plane> planes = new ArrayList<Plane>();
    
    public void addFlight(Flight flight) {
        flights.add(flight);
    }
    
    public void addPlane(Plane plane) {
        planes.add(plane);
    }
    
    public Plane planeSearch(String planeID) {
        int i = 0;
        for (Plane plane : planes) {
            if (plane.returnID().equals(planeID)) {
                i = planes.indexOf(plane);
            }
        }
        return planes.get(i);
    }
    
    public String returnFlights() {
        String newString = "";
        for (Flight everyFlight : flights) {
            newString += everyFlight + "\n";
        }
        return newString;
    }
    
    public String returnPlanes() {
        String newString = "";
        for (Plane plane : planes) {
            newString += plane + "\n";
        }
        return newString;
    }
}
