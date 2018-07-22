/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nacht
 */
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collection;

public class VehicleRegister {
    
    private HashMap <RegistrationPlate, String> owners = new HashMap <RegistrationPlate, String>();
    
    public boolean add(RegistrationPlate plate, String owner) {
        boolean c = false;
        if ((!owners.containsKey(plate)) || owners.get(plate) == null) {
            owners.put(plate, owner);
            c = true;
        }
        return c;
    }
    
    public String get(RegistrationPlate plate) {
        return owners.get(plate);
    }
    
    public boolean delete(RegistrationPlate plate) {
        boolean c = false;
        if (!(owners.get(plate) == null)) {
            owners.remove(plate);
            c = true;
        }
        return c;
    }
    
    public void printRegistrationPlates() {
        for (RegistrationPlate plate : owners.keySet()) {
            System.out.println(plate);
        }
    }
    
    public void printOwners() {
        ArrayList<String> previous = new ArrayList<String>();
        for (String owner : owners.values()) {
            if (!previous.contains(owner)) {
                System.out.println(owner);
                previous.add(owner);
            }
        }
    }
    
    
}
