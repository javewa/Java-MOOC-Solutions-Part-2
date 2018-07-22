/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nacht
 */
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;

public class RingingCentre {
    
    private Map<Bird, List<String>> observations;
    
    public RingingCentre() {
        this.observations = new HashMap<Bird, List<String>>();
    }
    
    public void observe(Bird bird, String place) {
        
        if (!observations.containsKey(bird)) {
            observations.put(bird, new ArrayList<String>());
        }
        
        List<String> places = observations.get(bird);
        places.add(place);
    }
    
    public void observations(Bird bird) {
        if (observations.keySet().contains(bird) && !observations.get(bird).isEmpty()) {
            System.out.println(bird + " observations: " + observations.get(bird).size());
            for (String place : observations.get(bird)) {
                System.out.println(place);
            }
        } else {
            System.out.println(bird + " observations: 0");
        }
    
    }
    
}
