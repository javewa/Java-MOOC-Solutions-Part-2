/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Rating;

/**
 *
 * @author nacht
 */
public class FilmComparator implements Comparator<Film>{
    
    private Map<Film, ArrayList<Rating>> ratings;
    
    public FilmComparator(Map<Film, ArrayList<Rating>> ratings) {
        this.ratings = ratings;
    }
    
    @Override
    public int compare(Film o1, Film o2) {
        int firstAvg = 0;
        for (Rating rating : ratings.get(o1)) {
            firstAvg += rating.getValue();
        }
        firstAvg /= ratings.get(o1).size();
        int secondAvg = 0;
        for (Rating rating : ratings.get(o2)) {
            secondAvg += rating.getValue();
        }
        secondAvg /= ratings.get(o2).size();
        return secondAvg - firstAvg;
    }
    
    
    
}
